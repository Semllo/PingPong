package types;

public class Person
{
    protected String name;
    protected String idCard;

    public Person()
    {
        name="";
        idCard="";
    }

    public Person(String name,String idCard)
    {
        this.name=name;
        this.idCard=idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean equals(Object p)
    {
        return (this.idCard.equals(((Person)p).idCard));
    }

    @Override
    public String toString()
    {
        return name + " " + idCard;
    }
}