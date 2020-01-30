//pract=practica, teor=teorica, desenv=desenvolvimiento, notf=nota final
//D.V:float practica(aprendizaje),teorica(comunicacion verbal),desenvolvimiento(uso de un lenguaje entendible) 
//1-2:Altamente desacuerdo, 3-4:En desacuerdo, 5-6:Indiferencia, 7-8: De acuerdo, 9-10: Totalmente de acuerdo
#include<iostream>
#include<conio.h>
#include<stdio.h>
#include<string.h>
#include<windows.h>
#include<stdlib.h>
#include<ctype.h>
using namespace std;
void DibujarDiagrama();
void Principal();
int n;
struct profesor 
{
	float pract,teor,desenv,notf;
	char prof[20];
}a[100];

int main()
{
	system("color 1F");
	int i,am=0,au=0,ac=0,pr=0,ha=0,eo=0,ex=0,cp=0,me=0;
	float prac=0,teo=0,desen=0;
	char entero[2];
	Principal();
	system("color 1F");
	while(!n>0)
	{
		system("cls"); n=0; fflush(stdin);	
		cout<<"\n\n\t\t\t\tIngrese el numero de docentes a evaluar: "; cin>>entero,2;
		if(!isdigit(entero[2]))
			n = atoi(entero);
	}
	for (i=1;i<=n;i++)
	{
		system("cls");
		cout<<"\t\t|---------------------------------|"<<endl;
		cout<<"\t\t| Responda con rangos del 1 al 10 |"<<endl;
		cout<<"\t\t|---------------------------------|"<<endl;
		cout<<"\t\t|  1-2:Altamente desacuerdo       |"<<endl;
		cout<<"\t\t|  3-4:En desacuerdo              |"<<endl;
		cout<<"\t\t|  5-6:Indiferencia               |"<<endl;
		cout<<"\t\t|  7-8:De acuerdo                 |"<<endl;
		cout<<"\t\t|  9-10:Totalmente de acuerdo     |"<<endl;
		cout<<"\t\t|---------------------------------|"<<endl<<endl;
		cout<<"\n \n";
		cout<<"\t\t  ****************************"<<endl;
		cout<<"\t\t  *                          *"<<endl;
		cout<<"\t\t  **EVALUACION DEL DOCENTE "<<i<<"**"<<endl;
		cout<<"\t\t  *                          *"<<endl;
		cout<<"\t\t  ****************************"<<endl<<endl<<endl;
		cout<<"Ingrese el nombre del docente: "; cin>>a[i].prof,20;
		cout<<"\n\n";
		cout<<"\t\t      ********************"<<endl;
		cout<<"\t\t        ASPECTOS A EVALUAR"<<endl;
		cout<<"\t\t      ********************"<<endl<<endl;
		cout<<" 1.-Practico"<<endl;
		cout<<"***********"<<endl<<endl;
		cout<<"  1.1-Fomenta un ambiente de trabajo y participacion: "; 
		while(!(am>0 && am<11))	
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				am = atoi(entero);
		}
		cout<<"  1.2-Usa ejemplos y casos relacionados con la vida real: "; 
		while(!(au>0 && au<11)) 
		{ fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				au = atoi(entero); 
		}
		cout<<"  1.3-Organiza actividades que permiten ejercitar la expresion oral y escrita: "; 
		while(!(ac>0 && ac<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				ac = atoi(entero);
		}
		cout<<"\n";
		a[i].pract=(am+au+ac)/3;
		cout<<" La nota practica del docente es: "<<a[i].pract<<endl;
		cout<<"*********************************";
		cout<<"\n\n\n";	
		cout<<" 2.-Teorico"<<endl;
		cout<<"**********"<<endl<<endl;
		cout<<"  2.1-Propicie la curiosidad y el deseo de aprender: "; 
		while(!(pr>0 && pr<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				pr = atoi(entero); 
		}
		cout<<"  2.2-Hace interesante la asignatura: "; 
		while(!(ha>0 && ha<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				ha = atoi(entero);
		}
		cout<<"  2.3-Escucha y toma en cuenta las opiniones de los estudiantes: "; 
		while(!(eo>0 && eo<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				eo = atoi(entero);
		}
		cout<<"\n";
		a[i].teor=(pr+ha+eo)/3;
		cout<<" La nota teorica del docente es: "<<a[i].teor<<endl;
		cout<<"*********************************";
		cout<<"\n\n\n";
		cout<<" 3.-Desenvolvimiento"<<endl;
		cout<<"*******************"<<endl<<endl;
		cout<<"  3.1-Explica los temas de forma clara y compresion: "; 
		while(!(ex>0 && ex<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				ex = atoi(entero);
		}
		cout<<"  3.2-Explica los contenidos del programa: "; 
		while(!(cp>0 && cp<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				cp = atoi(entero);
		}
		cout<<"  3.3-Muestra interes por el grado de compresion en sus explicaciones: "; 
		while(!(me>0 && me<11)) 
		{	fflush(stdin); cin>>entero,2;
			if(!isdigit(entero[2]))
				me = atoi(entero);
		}
		cout<<"\n";
		a[i].desenv=(ex+cp+me)/3;
		cout<<" La nota de desenvolvimiento del docente es: "<<a[i].desenv<<endl;
		cout<<"********************************************";
		cout<<"\n\n";
		prac=a[i].pract*0.60;
		teo=a[i].teor*0.30;
		desen=a[i].desenv*0.10;
		a[i].notf=prac+teo+desen;
		cout<<"|------------------------------------|"<<endl;
		cout<<"| La nota final del docente es: "<<a[i].notf<<"  |"<<endl;
		cout<<"|------------------------------------|"<<endl<<endl;
		getch();
		am=au=ac=pr=ha=eo=ex=cp=me=0;
	}
	DibujarDiagrama();
	system("cls");
	return 0;
}

void Principal()
{
	system("color 1F");
	//Declaracion de Cabecera para utilizar el posicionamiento 
	HANDLE hConsoleOutput; 
	COORD coord; 
	hConsoleOutput = GetStdHandle (STD_OUTPUT_HANDLE);
	
	
	coord.X = 27; coord.Y = 3;	// definicion de  las coordenadas
	SetConsoleCursorPosition (hConsoleOutput, coord); // indica en donde debo empezar a colocar el texto 
	cout<<"--  UNIVERSIDAD DE GUAYAQUIL  --";
	coord.X = 23; coord.Y = 5;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"--  CARRERA INGENIERIA DE SOFTWARE  --";
	coord.X = 29; coord.Y = 7;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"--PROYECTO ELABORADO POR:";
	coord.X = 29; coord.Y = 9;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"-- ALVARO CHIRIGUAYA VELEZ";
	coord.X = 29; coord.Y = 11;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"-- ANTHONY DEL VALLE LINO";
	coord.X = 26; coord.Y = 14;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"********************************";
	coord.X = 26; coord.Y = 15;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"*                              *";
	coord.X = 26; coord.Y = 16;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"**  BIENVENIDOS  AL  SISTEMA  **";
	coord.X = 26; coord.Y = 17;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"**       DE  EVALUACION       **";
	coord.X = 26; coord.Y = 18;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"**           DOCENTE          **";
	coord.X = 26; coord.Y = 19;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"*                              *";
	coord.X = 26; coord.Y = 20;	SetConsoleCursorPosition (hConsoleOutput, coord); 
	cout<<"********************************";
	coord.X = 1; coord.Y = 24; 
	SetConsoleCursorPosition (hConsoleOutput, coord);
	cout<<"Pulse una tecla para continuar......";
	getch();
	system("cls");	
}

void DibujarDiagrama()
{
	int i=0,x=0,y=10,promedio=0;
	system("cls");
	cout<<"\t\t  ************************"<<endl;
	cout<<"\t\t  *                      *"<<endl;
	cout<<"\t\t  **\tRESULTADOS\t**"<<endl;
	cout<<"\t\t  *                      *"<<endl;
	cout<<"\t\t  ************************"<<endl<<endl<<endl;
	for(i=1;i<=n;i++)
	{
		cout<<"Nombre: "<<a[i].prof<<endl;
		cout<<"Nota Final: "<<a[i].notf<<endl<<endl;
		
	}
	HANDLE hConsoleOutput; 
	COORD coord; 
	hConsoleOutput = GetStdHandle (STD_OUTPUT_HANDLE); 
	
	for(i=0;i<=10;i++)
	{
		coord.X = 30; coord.Y = 6+i;	//posicionamiento.
		if(y<10)
			coord.X = 31;
		SetConsoleCursorPosition (hConsoleOutput, coord); 
		cout<<y<<"|";
		y--;
	}
	if(n==1)
		x=10;
	else
		x= n*10;
	for(i=0;i<=x;i++)
	{
		coord.X = 32+i; coord.Y = 16; 
		SetConsoleCursorPosition (hConsoleOutput, coord); 
		cout<<"-";	
	}
	x=3;
	for(i=0;i<=n;i++)
	{	
		promedio = a[i].notf;
		coord.X = 28+x; coord.Y = 17; 
		SetConsoleCursorPosition (hConsoleOutput, coord);
		cout<<a[i].prof;
		for(int x1=1;x1<=promedio;x1++)
		{
			coord.X = 27+x; coord.Y = 16-x1; 
			SetConsoleCursorPosition (hConsoleOutput, coord); 
			cout<<"===";
		}
		x= x+8;
	}
	getch();
}
