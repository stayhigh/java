/*
 * interface vs class:
 * An interface is not a class. Writing an interface is similar to writing a class, but they are two different concepts. A class describes the attributes and behaviors of an object. An interface contains behaviors that a class implements
 *
 * interface features:
 *
 * - you can not instantiate an interface
 *   - an interface does not contain any constructor
 *   - all of the methods in an interface are abstract
 *   - an interface cannot contain instance field. The only fields that can appear in an interface must be declared both static and final
 *   - An interface is not extended by a class; it is implemented by a class.
 *   - An interface can extend multiple interfaces.
 * */


interface JavaInterfaces{
    final int final_int_field = 10; // the final variable must be assigned a value
    static int static_int_field = 2; // the static variable must be assigned a value
    abstract public void abstract_pub_method();
    //abstract protected void abstract_pro_method();
    //abstract private void abstract_pro_method();
}
