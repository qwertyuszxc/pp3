public class Family {
    Person[] allPersons;

    public Family(Person[] allPersons) {
        this.allPersons = allPersons;
    }

    public int adults(){
        int count=0;

        for (int i = 0; i < allPersons.length; i++) {
            if (allPersons[i].getAge()>=18){
                count++;
            }
        }
        return count;
    }
}