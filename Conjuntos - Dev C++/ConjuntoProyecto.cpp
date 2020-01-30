#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <windows.h>


//Prototipos de las funciones
void unio(int v, int v2, int c1[], int c2[]);
void menu(int v, int v2, int c1[], int c2[]);
void inter(int v, int v2, int c1[], int c2[]);
void dif(int v, int v2, int c1[], int c2[]);
void com(int v, int v2, int c1[], int c2[]);
void universo(int v, int v2, int c1[], int c2[]);
void limpia();
void dibujarCuadro2(int x1,int y1,int x2,int y2);
void gotoxy(int x,int y);
void CursorOn(bool visible, DWORD size);
void CursorOff();
int menuprincipal();


HANDLE console = GetStdHandle(STD_OUTPUT_HANDLE); //variable declarada para que el cursor aparezca


//MENU PRINCIPAL
int main(){
	int v, v2, opcion;
	
	int op;

	system("COLOR B0");

	dibujarCuadro2(1,1,78,24);//Llama a la funcion para hacer el Cuadro grande
	dibujarCuadro2(2,2,77,4);//Llama a la funcion para hacer el Cuadro del titulo
	gotoxy(16,3); //Los gotoxys sirven para dar una posicion a los mensajes en la pantalla 
	
	printf("            C  O  N  J  U  N  T  O  S");


	op = menuprincipal();
	
	
	//La variable op toma el valor que se ingrese por teclado
	//Si se ingresa el valor de 1 se realizán las diferentes operaciones de conjuntos
	if (op==1){

		gotoxy(4,7); printf("Ingrese numero de elementos para el conjunto A: ");
		scanf("%i",&v);
		
		int c1 [v];
		
		int p=9;
		
		for(int i=0; i<v; i++){
			gotoxy(4,p); printf("Ingrese valor %i: ",i+1);
			scanf("%i",&c1[i]);
			p+=2;
		}
		
		gotoxy(4,7); printf("                                                      ");
		
		limpia(); //LLama a la funcion limpia que borra parte de lo que se encuentre en pantalla
		
		gotoxy(4,7); printf("Conjunto A= ");
		
		int f=20;
		gotoxy(19,7); printf("{");
		for(int i=0; i<v; i++){
			gotoxy (f,7);printf("%i, ",c1[i]);
			f+=3;
		}
		gotoxy(f-2,7);
		printf("}");	
		
		printf("\n");
		gotoxy(4,10);printf("Ingrese numero de elementos para el conjunto B: ");
		scanf("%i",&v2);
		
		int c2 [v];
		
		p=12;
		
		for(int i=0; i<v2; i++){
			gotoxy(4,p);printf("Ingrese valor %i: ",i+1);
			scanf("%i",&c2[i]);
			p+=2;
		}
		
		limpia();
		f=55;
		gotoxy(40,7); printf("Conjunto B= ");
		gotoxy(54,7);printf("{");
		for(int i=0; i<v2; i++){
			gotoxy(f,7);printf("%i, ",c2[i]);
			f+=3;
		}
		
		gotoxy(f-2,7);printf("}");
		
		printf("\n");
		
		
		menu(v, v2, c1, c2);


	}
	
	
	//Si se ingresa el valor de 2 se realizán las operaciones binarias
	if (op==2){
		
		
		gotoxy(4,7); printf("Ingrese numero de elementos del conjunto universo: ");
		scanf("%i",&v);
		
		int c1 [v];
		
		int p=9,vc;
		
		for(int i=0; i<v; i++){
			gotoxy(4,p); printf("Ingrese valor %i: ",i+1);
			scanf("%i",&c1[i]);
			p+=1;
		}
		
		gotoxy(4,7); printf("                                                      ");
		
		limpia();
		
		gotoxy(4,7); printf("Conjunto Universo: {");
		
		int f=24;
		
		for(int i=0; i<v; i++){
			gotoxy (f,7);printf("%i, ",c1[i]);
			f+=3;
		}
		gotoxy(f-2,7);
		printf("}");	
		
		gotoxy(4,9); printf("Ingrese numeros de elementos del conjunto A: ");
		scanf("%i",&vc);
		
		int c2[vc];
		
		limpia();
		
		p=9;
		
		for(int i=0; i<vc ;i++){
			gotoxy(4,p); printf("Ingrese valor %i: ",i+1);
			scanf("%i",&c2[i]);
			p+=1;
		}
	
		
		limpia();
		f=63;
		gotoxy(50,7); printf("Conjunto A= {");
		for(int i=0; i<vc; i++){
			gotoxy(f,7);printf("%i, ",c2[i]);
			f+=3;
		}
		
		gotoxy(f-2,7);printf("}");
		
		printf("\n");
		
		
		int cb[v],r;
	
		for(int i=0; i<v; i++){
			cb[i] = 0;
		}
	
		for(int i=0; i<v; i++){
			r=0;
			for(int j=0; j<vc && r==0; j++){
				if(c1[i] == c2[j]){
					cb[i] = 1;
					r=1;	}
			}
		}
		
		f=32;
		gotoxy(4,11);printf("Representacion en binario: {");
		for(int i=0; i<v; i++){
			gotoxy(f,11);
			printf("%i, ",cb[i]);
			f+=3;
		}
		
		gotoxy(f-2,11);printf("}");
	
		getch();
		limpia();
		
		
		
		menuprincipal();
		
		
		getch();
	}
	
	
	//Si se ingresa el valor de 3 se sale del programa
	if (op==3) 
 
		exit(1);

	return 0;
}

//FUNCION QUE IMPRIME MENSAJES EN LA PANTALLA, Y SE INGRESA UN VALOR QUE LO TOMA OP
int menuprincipal(){
	limpia();
	gotoxy(4,7);printf("                                                                 ");
	gotoxy(4,8);printf("                                                                 ");
	int op;
	op=0;
	CursorOn(1,10);
	gotoxy(4,7); printf("MENU PRINCIPAL");
	gotoxy(4,9); printf("(1) Operaciones con conjuntos ");
	gotoxy(4,11); printf("(2) Representacion binaria");
	gotoxy(4,13);printf("(3) Salir");
	gotoxy(4,17); printf("Ingrese opcion: ");
	scanf("%i",&op);
	
	
	limpia();
	
	return op;
}



//FUNCION QUE IMPRIME MENSAJES EN LA PANTALLA, E INGRESA UN VALOR EN O PARA LLAMAR A OTRAS FUNCIONES (UNIO,INTER,DIF,COM,MENUPRINCIAL) 
void menu(int v, int v2, int c1[], int c2[]){
		int o,i=1;
		do{
		
		gotoxy(4,11);printf("OPERACIONES:\n");
		gotoxy(4,13);printf("1. Union\n");
		gotoxy(4,14);printf("2. Interseccion\n");
		gotoxy(4,15);printf("3. Diferencia\n");
		gotoxy(4,16);printf("4. Complemento\n");
		gotoxy(4,17);printf("5. Menu principal");
		gotoxy(4,19);printf("Ingrese opcion a realizar: ");
		scanf("%i",&o);
		if(o==1) unio(v,v2,c1,c2);
		if(o==2) inter(v,v2,c1,c2);
		if(o==3) dif(v,v2,c1,c2);
		if(o==4) com(v,v2,c1,c2);
		if(o==5) menuprincipal();
		}while(i);

}

//FUNCION QUE REALIZA EL CÁLCULO PARA LA UNION DE CONJUNTOS
void unio(int v, int v2, int c1[], int c2[]){
	limpia();
	int t = v+v2;
	int u[t];
	
	
	for(int i=0; i<v; i++){
		u[i] = c1[i];
	}
	
	for(int i=0; i<v2; i++){
			u[v] = c2[i];
			v++;
	}
	
	for(int i=0; i<t; i++){
		int j = i+1;
		while(j<t){
			if(u[i] == u[j]){
				for(int k=j ; k+1<t; k++){
					u[k] = u[k+1];
				}
				t--;
			}
			else j++;
		}
	}
	int f=25;
	gotoxy(4,11);printf("UNION DE CONJUNTOS: {");
	for (int i=0; i<t; i++){
		gotoxy(f,11);printf("%i, ",u[i]);
		f+=3;
	}
	gotoxy(f-2,11);printf("}");
	
	getch();
	limpia();
}

//FUNCION QUE REALIZA EL CÁLCULO PARA LA INTERSECCIÓN DE CONJUNTOS
void inter(int v, int v2, int c1[], int c2[]){
	limpia();
	int t = v+v2;
	int u[t];
	int vr=0;
	
	
	for(int i=0; i<v; i++){
		u[i] = c1[i];
	}
	
	for(int i=0; i<v2; i++){
			u[v] = c2[i];
			v++;
	}
	
	for(int i=0; i<t; i++){
		for(int j=i+1; j<t; j++)
			if(u[i] == u[j])
				vr++;						
	}
	
	int in[vr];
	int k=0;
	int l=0;
	
	for(int i=0; i<t; i++){
		for(int j=i+1; j<t; j++)
			if(u[i] == u[j]){
				k++;	
				while(l<k){
					in[l] = u[i];
				l++;}
		}
	}

	int f=32;
	gotoxy(4,11); printf("Interseccion de conjuntos: {");
	for (int i=0; i<vr; i++){
		gotoxy(f,11);printf("%i, ",in[i]);
		f+=3;
	}
	gotoxy(f-2,11);printf("}");
	
	getch();
	limpia();
}



//FUNCION QUE REALIZA EL CÁLCULO PARA LA DIFERENCIA DE CONJUNTOS
void dif(int v, int v2, int c1[], int c2[]){
	limpia();
	int vd=0;
	int ig;
	int op;
	
	gotoxy(4,9); printf("(1) A - B");
	gotoxy(4,11); printf("(2) B - A");
	gotoxy(4,15); printf("Ingrese opcion: ");
	scanf("%i",&op);
	limpia();
	
	
	if (op == 1){
	
	
	for(int i=0 ; i<v; i++){
		ig = 0;
		for(int j=0; j<v2 && ig==0; j++){
			if(c1[i] == c2[j])
				ig++;
		}
		
		if (ig == 0)
		vd++;	
	}
	
	int d[vd];
	int k=0;
	int l=0;
	
		
	for(int i=0 ; i<v; i++){
		ig=0;
		for(int j=0; j<v2 && ig==0; j++){
			if(c1[i] == c2[j])
				ig++;
	}
	
		if (ig == 0){
			k++;	
			while(l<k){
				d[l] = c1[i];
				l++;}
		}
			
	}
		
	
	
	int f=30;
	gotoxy(4,11);printf("Diferencia de conjuntos: {");
	for (int i=0; i<vd; i++){
		gotoxy(f,11);printf("%i, ",d[i]);
		f+=3;
	}
	gotoxy(f-2,11);printf("}");
	
	
	getch();
	limpia();
}


	if (op == 2){
	
	
	for(int i=0 ; i<v2; i++){
		ig = 0;
		for(int j=0; j<v && ig==0; j++){
			if(c2[i] == c1[j])
				ig++;
		}
		
		if (ig == 0)
		vd++;	
	}
	
	int d[vd];
	int k=0;
	int l=0;
	
		
	for(int i=0 ; i<v2; i++){
		ig=0;
		for(int j=0; j<v && ig==0; j++){
			if(c2[i] == c1[j])
				ig++;
	}
	
		if (ig == 0){
			k++;	
			while(l<k){
				d[l] = c2[i];
				l++;}
		}
			
	}
		
	
	
	int f=30;
	gotoxy(4,11);printf("Diferencia de conjuntos: {");
	for (int i=0; i<vd; i++){
		gotoxy(f,11);printf("%i, ",d[i]);
		f+=3;
	}
	gotoxy(f-2,11);printf("}");
	
	
	getch();
	limpia();
}



}



//FUNCION QUE REALIZA EL CÁLCULO PARA EL COMPLEMENTO DE CONJUNTOS
void com(int v, int v2, int c1[], int c2[]){
	universo(v,v2,c1,c2);
	int t = v+v2;
	int u[t];
	int op;
	
	gotoxy(4,11); printf("(1) Complemento de A ");
	gotoxy(4,13); printf("(2) Complemento de B");
	gotoxy(4,16); printf("Ingrese opcion: ");
	scanf("%i",&op);
	limpia();	
	
	
	if(op==1){
	for(int i=0; i<v; i++){
		u[i] = c1[i];
	}
	
	for(int i=0; i<v2; i++){
			u[v] = c2[i];
			v++;
	}
	
	for(int i=0; i<t; i++){
		int j = i+1;
		while(j<t){
			if(u[i] == u[j]){
				for(int k=j ; k+1<t; k++){
					u[k] = u[k+1];
				}
				t--;
			}
			else j++;
		}
	}	
	
	int cb[t];
	
	for(int i=0; i<t; i++){
		if(c1[i] == u[i])
			cb[i] = 0;
		else cb[i] = 1;
	}

		
	int cb2[t];
	int l=0;
	int k=0;
		
	for(int i=0; i<t; i++){
		if(cb[i] == 1){
			k++;
			while(l<k){
				cb2[l] = u[i];
				l++;}
	}
	}
	
	int f=23; 
	gotoxy(4,11);printf("Complemento de A: {");
	for(int i=0; i<k; i++){
		gotoxy(f,11);printf("%i, ",cb2[i]);
		f+=3;	
	}
	
	gotoxy(f-2,11);printf("}");

	getch();
	limpia();		
	
}

	if(op==2){
	for(int i=0; i<v; i++){
		u[i] = c1[i];
	}
	
	for(int i=0; i<v2; i++){
			u[v] = c2[i];
			v++;
	}
	
	for(int i=0; i<t; i++){
		int j = i+1;
		while(j<t){
			if(u[i] == u[j]){
				for(int k=j ; k+1<t; k++){
					u[k] = u[k+1];
				}
				t--;
			}
			else j++;
		}
	}	
	
	int cb[t];
	int r;
	
	for(int i=0; i<t; i++){
		cb[i] = 0;
	}
	
	for(int i=0; i<t; i++){
		r=0;
		for(int j=0; j<v2 && r==0; j++){
			if(u[i] == c2[j]){
				cb[i] = 1;
				r=1;	}
		}
	}

		
	int cb2[t];
	int l=0;
	int k=0;
		
	for(int i=0; i<t; i++){
		if(cb[i] == 0){
			k++;
			while(l<k){
				cb2[l] = u[i];
				l++;}
	}
	}
	
	int f=23; 
	gotoxy(4,11);printf("Complemento de B: {");
	for(int i=0; i<k; i++){
		gotoxy(f,11);printf("%i, ",cb2[i]);
		f+=3;	
	}
	
	gotoxy(f-2,11);printf("}");

	getch();
	limpia();		
	
}




}




//FUNCION QUE REALIZA EL CÁLCULO PARA EL UNIVERSO DE CONJUNTOS
void universo(int v, int v2, int c1[], int c2[]){
	limpia();
	int t = v+v2;
	int u[t];
	
	
	for(int i=0; i<v; i++){
		u[i] = c1[i];
	}
	
	for(int i=0; i<v2; i++){
			u[v] = c2[i];
			v++;
	}
	
	for(int i=0; i<t; i++){
		int j = i+1;
		while(j<t){
			if(u[i] == u[j]){
				for(int k=j ; k+1<t; k++){
					u[k] = u[k+1];
				}
				t--;
			}
			else j++;
		}
	}
	int f=20;
	gotoxy(4,8);printf("Conjunto U =   {");
	for (int i=0; i<t; i++){
		gotoxy(f,8);printf("%i, ",u[i]);
		f+=3;
	}
	gotoxy(f-2,8);printf("}");
	
	
		
}




// Funcion para ocultar el cursor
void CursorOff()
{
  CONSOLE_CURSOR_INFO cursor = {1, FALSE};
  SetConsoleCursorInfo(GetStdHandle(STD_OUTPUT_HANDLE), &cursor);
}

//Funcion para aparecer cursor
void CursorOn(bool visible, DWORD size) // set bool visible = 0 - invisible, bool visible = 1 - visible
{
	if(size == 0)
	{
		size = 20;	// default cursor size Changing to numbers from 1 to 20, decreases cursor width
	}
	CONSOLE_CURSOR_INFO lpCursor;	
	lpCursor.bVisible = visible;
	lpCursor.dwSize = size;
	SetConsoleCursorInfo(console,&lpCursor);
}


//Funcion Gotoxy
void gotoxy(int x,int y){  
      HANDLE hcon;  
      hcon = GetStdHandle(STD_OUTPUT_HANDLE);  
      COORD dwPos;  
      dwPos.X = x;  
      dwPos.Y= y;  
      SetConsoleCursorPosition(hcon,dwPos);  
 }


//FUNCION QUE DIBUJA UN CUADRO
void dibujarCuadro2(int x1,int y1,int x2,int y2)
{

    int i;
    for (i=x1;i<x2;i++)
    {
	gotoxy(i,y1);printf("Ä") ;//linea horizontal superior
	gotoxy(i,y2);printf("Ä") ;//linea horizontal inferior
    }

    for (i=y1;i<y2;i++)
    {
	gotoxy(x1,i);printf("³") ;//linea vertical izquierda
	gotoxy(x2,i);printf("³") ;//linea vertical derecha
    }
    gotoxy(x1,y1);printf("Ú");
    gotoxy(x1,y2);printf("À");
    gotoxy(x2,y1);printf("¿");
    gotoxy(x2,y2);printf("Ù");
}


//FUNCION LIMPIAR AREA
void limpia(){
	int i,j;
	for(i=9;i<=23;i++){
		for(j=4;j<=74;j++){
			gotoxy(j,i); printf(" ");}}
}








