package two;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 打印两个有序链表的公共部分
 * 有序链表：链表中的元素，是根据某个属性，有顺序的：升序，降序，或其它顺序
 * 单向链表，只能拿到下一个元素
 */
public class PrintCommonPartTest {
    @Test
    void should_return_common_part_given_two_link_lists() {
        //given
        Node head1 = new Node(1);
        head1.setNext(new Node(2));
        Node head2 = new Node(2);
        head2.setNext(new Node(4));
        //when
        List<Integer> commonElements = PrintCommonPart.getCommon(head1, head2);
        //then
        assertThat(commonElements.size()).isEqualTo(1);
        assertThat(commonElements).contains(2);
    }

    @Test
    void test_year_month_day_with_simple_date_format() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
    }

    @Test
    void test_year_month_day_with_date_format() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDateTime = LocalDate.now().minusDays(2);
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}
