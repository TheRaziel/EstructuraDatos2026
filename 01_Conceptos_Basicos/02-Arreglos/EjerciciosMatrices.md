# Ejercicio Matrices.
1. Objetivos:Aplicar la logica de arreglos divimensionales(matriz en java) utilizando el paradigma de programacion orientada a objetos(poo) implementando validaciones de dimensiones, recodidos de indices y encasublacion.

## Ejercicio 1 Sistema de reserva de asientos(m*n):
# Diseña un metodo que se llame "rservaasiento"(int fila, int columna), que controle el mapa  deocupacion de un teatro o sala  la matriz iniciara con 'cero'(significa libre), si  el asiento solicitado contiene cero, cambialo a "1"**Ocupado** y muestre un mensaje de exito.
Si el asiento ya contiene 1, notifica que ya esta ocupado.
Vlidar que las coordenadas ingresadas no excedan los limites de la matriz 

## Ejercicio 2 Acomulado de Ventas por sucursal e mes (m*n)
Una empresa registra las ventas enteras de "m" sucursales en "m" meses.
1. Implementar un metodo que calcule la suma por cada fila(Total por sucursal).
2. Calcular la suma por cada columna(Total por mes)
3. Genera un reporte formateado que muestre ambos totales en un solo panel de texto

## Ejercicio 3 Diagnostico de matriz, identidad y diagonal Principal(n*m)
1. Implementa un modulo para  analisis algebraicio: **Validacion previa**: Comprueba si la matriz es cuadrada. si no lo es, cancela la operacion y muestra un mensaje de advertencia.
2. Si es Cuadrada, evalua si es una matriz identidad(Si es cuadrada **evalua si es una matris identidad** unos en la diagonal principal y unos ceros en el restro de la matriz).
3. Calcula e imprime la suma de los elementos de la diagonal principal. 
## Ejercicio 4 Tranposicion dinamica de Matriz (M*N -> N*M)
1. Crea un metodo obtener transpuesta que invierta la orientacion de los datos.
2. La funcion debe de retornar una nueva instancia de la clase matriz con dimensiones invertidad (n*m).
3. Copia cada  elemento siguiendo la regla de transpuesta[j][i]=  original[i][j].
## Ejercicio 5 Rotacion de la matriz a 90Grados en sentido Horario(n*m)
1. Simula el giro de una matriz cuadrada de pixeles en mapa
2. Verifica que la matriz sea estrictamente cuadrada
3. rotar 90Grados a la derecha