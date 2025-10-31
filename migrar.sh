#!/bin/bash

USER="Maliketh4bc"
DEST_DIR="$(pwd)"
REPOS_FILE="repos.txt"

mkdir -p temp

echo ""
echo "🚀 Iniciando migración de ejercicios desde GitHub..."
echo ""

# Leer lista de repositorios
while IFS= read -r repo || [ -n "$repo" ]; do
  repo=$(echo "$repo" | tr -d '\r')
  [ -z "$repo" ] && continue

  echo "🔹 Clonando $repo ..."
  URL="https://github.com/$USER/$repo.git"

  # Clonar y verificar errores
  if ! git clone --depth 1 "$URL" "temp/$repo" 2>/dev/null; then
    echo "❌ Error: no se pudo clonar $repo (revisa el nombre o si es privado)"
    continue
  fi

  # Detectar unidad según el número del nombre del repo
  if [[ "$repo" == *"05"* ]]; then
    UNIT="unidad_05"
  elif [[ "$repo" == *"04"* ]]; then
    UNIT="unidad_04"
  elif [[ "$repo" == *"03"* ]]; then
    UNIT="unidad_03"
  elif [[ "$repo" == *"02"* ]]; then
    UNIT="unidad_02"
  elif [[ "$repo" == *"01"* ]]; then
    UNIT="unidad_01"
  else
    UNIT="otros"
  fi

  mkdir -p "$DEST_DIR/$UNIT"

  # Si el repo ya existe, eliminarlo antes de mover el nuevo
  if [ -d "$DEST_DIR/$UNIT/$repo" ]; then
    rm -rf "$DEST_DIR/$UNIT/$repo"
  fi

  mv "temp/$repo" "$DEST_DIR/$UNIT/$repo"

  # Eliminar subrepos (.git internos)
  find "$DEST_DIR/$UNIT/$repo" -type d -name ".git" -exec rm -rf {} +

  echo "✅ $repo añadido correctamente en $UNIT"
  echo ""

done < "$REPOS_FILE"

# Limpiar carpeta temporal
rm -rf temp

echo ""
echo "🎯 Migración completa."
echo "Si ves ❌, revisa esos repos en log.txt o en GitHub (nombre exacto o privado)."
echo ""
