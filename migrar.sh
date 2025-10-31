#!/bin/bash

USER="Maliketh4bc"
DEST_DIR="$(pwd)"
REPOS_FILE="repos.txt"

mkdir -p temp

# Leer lista de repositorios
while IFS= read -r repo || [ -n "$repo" ]; do
  repo=$(echo "$repo" | tr -d '\r')
  [ -z "$repo" ] && continue

  echo "🔹 Clonando $repo ..."
  echo "Intentando clonar https://github.com/$USER/$repo.git"

  if ! git clone --depth 1 "https://github.com/$USER/$repo.git" "temp/$repo"; then
    echo "❌ Error: no se pudo clonar $repo"
    continue
  fi

  # Detectar unidad según el número del nombre del repo (admite 'ejercicio' y 'ejercicios')
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

# Limpiar carpeta temporal
rm -rf temp

echo ""
echo "✅ ¡Listo! Todos los ejercicios fueron migrados correctamente."
echo "Si alguno falló, revisa los mensajes ❌ arriba."
