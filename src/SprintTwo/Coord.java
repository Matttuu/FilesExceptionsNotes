package SprintTwo;
// https://www.youtube.com/watch?v=SRun3TjAqwQ
public class Coord {

    public final int row;
    public final int col;

    // Constructor

    public Coord(int ir, int ic){
        this.row = ir;
        this.col = ic;
    }

    public String toString(){
        return String.format("(%d, %d)",row,col);
    }

    // Are coordinates equal
    public boolean equals(Coord c){
        return this.row==c && this.col==c.col;
    }
}
