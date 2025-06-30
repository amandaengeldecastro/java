#!bin/bash

echo "==================="
echo "Criando as imagens"
echo "==================="

docker build -t amandaengeldecastro/backend:1.0 backend/.
docker build -t amandaengeldecastro/database:1.0 database/.

echo "==================="
echo "Push das imagens"
echo "==================="

docker push amandaengeldecastro/backend:1.0
docker push amandaengeldecastro/database:1.0

echo "==================="
echo "Criando as serviços"
echo "==================="

kubectl apply -f ./services.yml

echo "==================="
echo "Criando deployments"
echo "==================="

kubectl apply -f ./deployment.yml
