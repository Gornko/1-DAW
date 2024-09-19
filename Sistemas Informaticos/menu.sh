#!/bin/bash

# Función que suma dos números
suma() {
  local num1=$1
  local num2=$2
  local resultado=$((num1 + num2))
  echo "El resultado de la suma es: $resultado"
}

# Función para mostrar el menú
mostrar_menu() {
  echo "-------------------------------"
  echo "         Menú Principal         "
  echo "-------------------------------"
  echo "1) Imprime Hola Mundo!"
  echo "2) Crear un archivo"
  echo "3) Realizar una suma"
  echo "4) Salir"
  echo "-------------------------------"
  echo "Elige una opción:"
}

# Función para crear un archivo
crear_archivo() {
  echo "Introduce el nombre del archivo a crear:"
  read archivo
  touch "$archivo"
  echo "Archivo '$archivo' creado."
}

# Bucle principal
while true; do
  mostrar_menu
  read opcion
  
  case $opcion in
    1)
      echo "Hola Mundo!"
      ;;
    2)
      crear_archivo
      ;;
    3)
      echo "Introduce el primer número:"
      read num1
      echo "Introduce el segundo número:"
      read num2
      suma $num1 $num2
      ;;
    4)
      echo "Saliendo del programa..."
      exit 0
      ;;
    *)
      echo "Opción no válida. Por favor, elige una opción del 1 al 4."
      ;;
  esac
done
