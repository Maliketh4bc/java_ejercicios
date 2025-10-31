#!/bin/bash

echo "🔧 Reorganizando carpetas de ejercicios..."

# Crear carpetas base
for n in 01 02 03 04 05; do
  mkdir -p "unidad_$n"
done

# Buscar carpetas mal ubicadas y moverlas (sin warnings de find)
find . -maxdepth 2 -type d | while read dir; do
  base=$(basename "$dir")

  case "$base" in
    *"01"*)
      destino="unidad_01"
      ;;
    *"02"*)
      destino="unidad_02"
      ;;
    *"03"*)
      destino="unidad_03"
      ;;
    *"04"*)
      destino="unidad_04"
      ;;
    *"05"*)
      destino="unidad_05"
      ;;
    *)
      continue
      ;;
  esac

  # Evitar mover las carpetas de unidad_* o la raíz
  if [[ "$dir" == *"unidad_"* ]] || [[ "$dir" == "." ]]; then
    continue
  fi

  # Mover si no está ya dentro de su unidad
  if [[ "$dir" != *"$destino"* ]]; then
    echo "📦 Moviendo $base → $destino"
    mv "$dir" "$destino/$base" 2>/dev/null
  fi
done

# Eliminar unidad_03 si está vacía
if [ -d "unidad_03" ] && [ -z "$(ls -A unidad_03)" ]; then
  rm -rf unidad_03
  echo "🗑️  Eliminada unidad_03 (vacía)"
fi

echo "✅ Reorganización completa."
