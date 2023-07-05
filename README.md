## Console H2
http://localhost:8092/h2-console

## creamos la imagen
docker build -t app-cambista .

## lista imagenes
docker images

## ejecutamos el contenedor
docker run -p 80:8092 app-cambista