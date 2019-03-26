/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );

        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           Create the test data in an array, for the programming
           convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
               for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() + "\ncurrent list: " + list);
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

        list.set(0, "s");
        list.set(1, "a");
        list.set(3, "h");

        System.out.println("list after setting: " + list + System.lineSeparator());

        for (int i = 0; i < list.size(); i++){
          System.out.println("list at index " + i + ": " + list.get(i));
        }

        list.add(1, "tudy");
        list.add(0, "SS");
        list.add(list.size(), "haha");
        System.out.println("list after adding: " + list + System.lineSeparator());

        System.out.println(list.remove(0));
        System.out.println(list.remove(1));
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list);



    }
}
