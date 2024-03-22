import java.util.List;


class StreamComparator {
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(stream1.teachGroups.size(), stream2.teachGroups.size());
    }
}

public class Main {
    public static void main(String[] args) {
        Stream stream1 = new Stream();
        stream1.addTeachGroup(new TeachGroup("Группа электриков", List.of("Андрей", "Антон", "Валерий")));
        stream1.addTeachGroup(new TeachGroup("Группа юристов", List.of("Александра", "Эмилия")));
        stream1.addTeachGroup(new TeachGroup("Группа бухгалтеров", List.of("Екатерина", "Евгения")));

        Stream stream2 = new Stream();
        stream2.addTeachGroup(new TeachGroup("Группа программистов", List.of("Егор", "Анжелла")));
        stream2.addTeachGroup(new TeachGroup("Группа экономистов", List.of("Валерия", "Мария", "Дарья")));

        StreamComparator comparator = new StreamComparator();
        int result = comparator.compare(stream1, stream2);
        System.out.println("Результат сравнения: " + result);
    }
}