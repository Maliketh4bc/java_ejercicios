#!/bin/bash

USER="Maliketh4bc"
DEST_DIR="$(pwd)"
REPOS_FILE="repos.txt"

mkdir -p temp

while read -r repo; do
  [ -z "$repo" ] && continue

  echo "🔹 Clonando $repo ..."
  git clone --depth 1 https://github.com/$USER/$repo.git temp/$repo

  # Detectar unidad automáticamente
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
  mv "temp/$repo" "$DEST_DIR/$UNIT/$repo"

done < "$REPOS_FILE"

rm -rf temp
echo "✅ ¡Listo! Todos los ejercicios fueron migrados correctamente."
