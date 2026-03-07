class Hospital
{
    String hospitalName;
    String location;

    Hospital(String h, String l)
    {
        hospitalName = h;
        location = l;
    }
}

class Doctor extends Hospital
{
    String doctorName;
    String specialization;

    
    Doctor(String h, String l, String d, String s)
    {
        super(h, l);   // calls parent constructor
        doctorName = d;
        specialization = s;
    }

    void display()
    {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Location: " + location);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }

    public static void main(String args[])
    {
        Doctor d1 = new Doctor("City Hospital", "Chennai", "Dr. Kumar", "Cardiologist");
        d1.display();
    }
}