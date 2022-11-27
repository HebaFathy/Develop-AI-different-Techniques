#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<math.h>
#include<iostream.h>

//*******************
#define POPSIZE 50
#define MAXGENS 500
#define NVARS 3
#define PXOVER 0.8
#define PMUTATION 0.15
#define TRUE 1
#define FALSE 0
//*************************
 int generation;
 int n_terms;
 int cur_best;
 FILE *galgo;
 //************************

 struct genotype
 {
   double gene[NVARS];
   double fitness;
   double upper[NVARS];
   double lower[NVARS];
   double rfitness;
   double cfitness;
 };

 //*************************

 struct genotype population[POPSIZE+1];
 struct genotype newpopulation[POPSIZE+1];
 //*************************

 void intialize();
 double randval(double,double);
 void evaluate();
 void keep_the_best();
 void elitist();
 void select();
 void crossover();
 void Xover(int,int);
 void swap(double*,double*);
 void mutate();
 void report();

 //**************************

void intialize()
{ //FILE *infile;
    int i,j;
    double lbound,ubound;
  //if((infile= fopen("E:\kafafy\gadata.txt","r"))==NULL)
 /// {
  //fprintf(stderr,"\n cannot open the input file");
    cout<<"you must input the upper and lower bounds of your variabls"<<endl;


   for (i=0; i<NVARS ;i++)
   {  cout<<" Enter  lowerbound & upperbound of the variable X["<<i+1<<"]:";
      cin>>lbound;
      //cout<<" the  of variable X["<<i+1<<"]is:";
      cin>>ubound;


         for(j=0;j<POPSIZE;j++)
		 {     population[j].fitness=0;
             population[j].rfitness=0;
             population[j].cfitness=0;
             population[j].lower[i]=lbound;
             population[j].upper[i]=ubound;
             population[j].gene[i]=randval(population[j].lower[i],population[j].upper[i]);
		 }

    }

}
/*else {

  for (i=0; i<NVARS ;i++)
  {  fscanf(infile, "%lf",&lbound);
     fscanf(infile, "%lf",&lbound);

 for(j=0;j<POPSIZE;j++)
 {population[j].fitness=0;
  population[j].rfitness=0;
  population[j].cfitness=0;
  population[j].lower[i]=lbound;
  population[j].upper[i]=ubound;
  population[j].gene[i]=randval(population[j].lower[i],population[j].upper[i]);
 }

  }

  fclose(infile);*/


//*******************************

double randval(double low, double high) //get random value for each gene in popoulations
{
 double val;
//cout<<"random value is:";

  val =((double)(rand()%1000)/1000.0)*(high-low)+low;
   //cout<<"\n"<<val;
  return val;
}
//******************************

void evaluate() //evalute the  solutions
{int mem;
int i;
double x[NVARS+1];
for(mem=0; mem<POPSIZE;mem++)
{ for (i=0;i<NVARS;i++)
         x[i+1]= population[mem].gene[i];
//******************
          population[mem].fitness=(x[1]*x[1])-(x[1]*x[2])+x[3];

			  //*******************
}

}


//******************************

void keep_the_best() //keep the best solution
{
 int mem;
 int i;
 cur_best=0;
 for(mem=0;mem<POPSIZE;mem++)
 {
  if (population[mem].fitness>population[POPSIZE].fitness)
  {
   cur_best=mem;
   population[POPSIZE].fitness=population[mem].fitness;
  }
 }
 //get genes for the best solution ......(make copy of best solution)
 for(i=0;i<NVARS;i++)
   population[POPSIZE].gene[i]=population[cur_best].gene[i];
}
//****************************************************************///marwah

void elitist()
{
      int i;
      double best,worst;
      int best_mem,worst_mem;
      best= population[0].fitness;
      worst= population[0].fitness;
      for(i=0;i<POPSIZE-1;++i)
          {
             if(population[i].fitness>population[i+1].fitness)
             {
                 if(population[i].fitness>=best)
                     {
                       best=population[i].fitness;
                       best_mem=i;
                     }
                  if(population[i+1].fitness<=worst)
                     {
                       worst=population[i+1].fitness;
                       worst_mem=i+1;
                     }
             }
             else {

                   if(population[i].fitness<=worst)
                     {
                       worst=population[i].fitness;
                       worst_mem=i;
                     }
                   if(population[i+1].fitness>=best)
                     {
                       best=population[i+1].fitness;
                       best_mem=i+1;
                     }

                  }
           }
             if(best>=population[POPSIZE].fitness)
               {for(i=0;i<NVARS;i++)
                 population[POPSIZE].gene[i]=population[best_mem].gene[i];
                 population[POPSIZE].fitness=population[best_mem].fitness;
               }
             else { for(i=0;i<NVARS;i++)
                    population[worst_mem].gene[i]=population[POPSIZE].gene[i];
                    population[worst_mem].fitness=population[POPSIZE].fitness;

                  }
}
//******************


void select()
{ int mem,i,j,k;
  double sum=0;
  double p;
     for(mem=0;mem< POPSIZE;mem++)
        {
         sum+=population[mem].fitness;
        }
     for(mem=0;mem< POPSIZE;mem++)
        {
         population[mem].rfitness=population[mem].fitness/sum;
        }
  population[0].cfitness=population[0].rfitness;
  for(mem=1;mem< POPSIZE;mem++)
  population[mem].cfitness=population[mem-1].cfitness+population[mem].rfitness;
     for(i=0;i<POPSIZE;i++)
         {
                 p=rand()%1000/1000.0;
                 if(p<population[0].cfitness)
                 newpopulation[i]= population[0];
                 else {   for(j=0;j< POPSIZE;j++)
                         if(p>=population[j].cfitness && p<population[j+1].cfitness)
                         newpopulation[i]= population[j+1];


                       }

         }
    for(i=0;i<POPSIZE;i++) population[i]=newpopulation[i];

}
//***********
void crossover()
    { int    i,mem,one;
      int    first=0;
      double x;
      for(mem=0;mem<POPSIZE;++mem)
         { x= rand()%1000/1000.0;
            if(x<PXOVER)
               {++first;
                if(first%2==0)
                   Xover(one,mem);
                else
                     one=mem;

               }
         }
    }
  ///*****************

    void Xover(int one,int two)
    {  int   i;
       int   point;
         if(NVARS>1)
           { if(NVARS==2)
                  point=1;
             else point= (rand()%(NVARS-1))+1;
                 for(i=0;i<point;i++)
                    swap(&population[one].gene[i],&population[two].gene[i]);
           }

    }
//********************
    void swap(double*x,double*y)
     {   double   temp;
         temp=*x;
         *x=*y;
         *y=temp;
     }
//**********************

    void mutate()
     {
         int i,j;
         double lbound,hbound;
         double x;

         for (i=0; i<POPSIZE;i++)
            for (j=0; j<NVARS;j++)
               {
                 x= rand()%1000/1000.0;
                 if(x<PMUTATION)
                   {
                     lbound=population[i].lower[j];
                     hbound=population[i].upper[j];
                     population[i].gene[j]=randval(lbound,hbound);
                    }
               }

      }
//******************

 void report()
 { int i;
   double best_val;
  double avg;
  double stdev;
  double sum_square;
  double square_sum;
  double sum;
  sum=0;
  sum_square=0.0;
  for(i=0;i<POPSIZE;i++)
     {  sum+=population[i].fitness;
        sum_square=population[i].fitness * population[i].fitness;
     }
     avg= sum/(double)POPSIZE;
     square_sum=avg*avg*(double)POPSIZE;
     stdev=sqrt((sum_square-square_sum)/(POPSIZE-1));
     best_val=population[POPSIZE].fitness;
     fprintf(galgo,"  \n%5d,                   %6.3f,                  %6.3f,    \n",generation,
     best_val,avg);
 }
///*********************
void main()
{ int i;
//FILE *galgo;
  if ((galgo=fopen("galgo.txt","w"))==NULL)
      { exit(1);

      }
      generation=0;
   fprintf(galgo,"\n generation best average standard \n");
   fprintf(galgo,"\n   Generation#         Best_fitness       Ava_fitness \n");
   intialize();
   evaluate();
   keep_the_best();
   while (generation<MAXGENS)
          { generation++;
            select();
            crossover();
            mutate();
            report();
            evaluate();
            elitist();


          }
       fprintf(galgo,"\n\n simulation completed \n");
       fprintf(galgo,"\n best member: \n");
       for(i=0;i< NVARS;i++)
       {
       fprintf(galgo,"\n X(%d): =%3.3f",i+1,population[POPSIZE].gene[i]);
	   printf("\n X(%d): =%3.3f",i+1,population[POPSIZE].gene[i]);
       }
       fprintf(galgo,"\n\n Best fitness : =%3.3f",population[POPSIZE].fitness);
	   printf("\n\n Best fitness : =%3.3f",population[POPSIZE].fitness);
       fclose(galgo);
       printf("\n\n                          Success\n");
	   cout<<"\n*********************************************************";
	   cout<<"\n******         THE SIMULATION IS COMPLETED        *******";
	   cout<<"\n******        YOU MUST OPEN THE OUTPUT FILE       *******";
	   cout<<"\n******             TO SEE THE RESULTS             *******";
	   cout<<"\n******           output file is:galgo.txt         *******";
       cout<<"\n*********************************************************";
	   getch();
}
//****************************************************************