#!/bin/bash

# Función que suma dos números
suma() {
  local num1=$1
  local num2=$2
  local resultado=$((num1 + num2))
  echo $resultado
}

# Ejecución
echo "Introduce el primer número:"
read num1
echo "Introduce el segundo número:"
read num2

resultado=$(suma $num1 $num2)
echo "La suma de $num1 y $num2 es: $resultado"
