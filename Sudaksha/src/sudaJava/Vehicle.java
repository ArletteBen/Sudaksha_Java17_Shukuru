package sudaJava;

public sealed interface Vehicle permits Bus,AeroPlane{
public void wheels();
public void engines();
}
