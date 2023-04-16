import tkinter as tk
import tkinter.messagebox as msg

class mayor_grupo:
    def __init__(self):
        self.datos = []
    
    def mayor(self):
        a = -1
        for i in self.datos:
            if i >= a:
                a = i
        return a
    
    def getFloat(self,txt):
        a = float(txt.get())
        txt.delete(0,tk.END)
        return a

    def Final(self):
        mayor = self.mayor()
        mayors = str(mayor)
        if mayor != -1:
            msg.showinfo("El mayor", "El número mayor entre los datos ingresados es " + mayors)
        else:
            msg.showinfo("Advertencia", "Por favor ingrese al menos un dato")

Datos = mayor_grupo()

VentanaPrincipal = tk.Tk()
VentanaPrincipal.title("Número Mayor")
VentanaPrincipal.geometry("480x90")

#Comentario de indicaciones
lblP = tk.Label(VentanaPrincipal, text = "Por favor ingrese los datos uno por uno pulsando añadir, al finalizar pulse calcular \nAl pulsar borrar, los datos que hayan sido añadidos se borran")
lblP.grid(row = 0, column = 0, columnspan = 6, padx = 30)

#Entrada de texto
txtDatos = tk.Entry(VentanaPrincipal)
txtDatos.grid(row = 2, column = 0, padx = 5, pady = 5)

#Botones
btnAñadir = tk.Button(VentanaPrincipal, text = "Añadir", command = lambda: Datos.datos.append(Datos.getFloat(txtDatos)))
btnAñadir.grid(row = 2, column = 1, pady = 5)

btnBorrar = tk.Button(VentanaPrincipal, text = "Borrar", command = lambda: Datos.datos.clear())
btnBorrar.grid(row = 2, column = 2, pady = 5)

btnCalcular = tk.Button(VentanaPrincipal, text = "Calcular", command = lambda: Datos.Final())
btnCalcular.grid(row = 2, column = 3, pady = 5)

btnCerrar = tk.Button(VentanaPrincipal, text = "Cerrar", command = VentanaPrincipal.destroy)
btnCerrar.grid(row = 2, column = 4, pady = 5)

VentanaPrincipal.mainloop()