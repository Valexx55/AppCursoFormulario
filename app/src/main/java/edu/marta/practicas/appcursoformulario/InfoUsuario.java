package edu.marta.practicas.appcursoformulario;

import android.os.Parcel;
import android.os.Parcelable;

public class InfoUsuario implements Parcelable {

    private String nombre;
    private String apellido;
    private String localidad;
    private String fecha;
    private int codigo_postal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public InfoUsuario(String nombre, String apellido, String localidad, String fecha, int codigo_postal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.fecha = fecha;
        this.codigo_postal = codigo_postal;
    }

    protected InfoUsuario(Parcel in) {
        nombre = in.readString();
        apellido = in.readString();
        localidad = in.readString();
        fecha = in.readString();
        codigo_postal = in.readInt();
    }

    public static final Creator<InfoUsuario> CREATOR = new Creator<InfoUsuario>() {
        @Override
        public InfoUsuario createFromParcel(Parcel in) {
            return new InfoUsuario(in);
        }

        @Override
        public InfoUsuario[] newArray(int size) {
            return new InfoUsuario[size];
        }
    };

    @Override
    public String toString() {
        return "InfoUsuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", localidad='" + localidad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", codigo_postal=" + codigo_postal +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(apellido);
        parcel.writeString(localidad);
        parcel.writeString(fecha);
        parcel.writeInt(codigo_postal);
    }
}
