package Methods;

public class Scope {

    // variables declared inside of a block are scoped within that block

    // cannot access x here
    {
        int x = 10;
        // can access x here
    }
    // cannot access x here
}
