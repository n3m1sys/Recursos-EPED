## ListIPIF

En el desarrollo de la interfaz se han tomado las siguientes consideraciones:

- Se considera que la clase que implemente *ListIPIF* tendrá que tener un atributo que actue de puntero.

- Esta no extiende a *ListIF*, ya que esta interfaz da acceso a metodos que permiten modificar otros elementos de la lista que no son el punto de interes.

- Sí que estaría bien que uno de los atributos fuera una *ListIF* (o implementación de ésta) a la vez de tener un puntero de forma de *int* y que las llamadas a los metodos get(), set(), remove() e insert() interactuen con los metodos de mismo nombre de *ListIF* con apoyo del puntero.