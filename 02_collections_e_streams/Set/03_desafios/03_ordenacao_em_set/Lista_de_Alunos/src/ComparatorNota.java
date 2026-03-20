import java.util.Comparator;

class ComparatorNota implements Comparator<Aluno> {
    
        @Override
        public int compare(Aluno o1, Aluno o2) {
            return Double.compare(o1.getMedia(), o2.getMedia());
        }
    }