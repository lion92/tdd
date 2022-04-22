import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void should_be_Fizz_when_number_is_3(){
        //Given
       int number=3;

       //when
        new FizzBuzz().fizzBuzz(3);
        //result
        String result="Fizz";
        //then
        assertThat(result).isEqualTo(new FizzBuzz().fizzBuzz(3));

    }

    @Test
    public void should_be_Buzz_when_number_is_5(){
        //Given
        int number=5;

        //when
        String when = new FizzBuzz().fizzBuzz(5);
        //result
        String result="Buzz";
        //then
        assertThat(result).isEqualTo(when);

    }


    @Test
    public void should_be_1_when_number_is_1(){
        //Given
        int number=1;

        //when
        String when = new FizzBuzz().fizzBuzz(1);
        //result
        String result="1";
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_2_when_number_is_2(){
        //Given
        int number=2;

        //when
        String when = new FizzBuzz().fizzBuzz(2);
        //result
        String result="2";
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_Fizz_when_number_is_6(){
        //Given
        int number=6;

        //when
        String when = new FizzBuzz().fizzBuzz(6);
        //result
        String result="Fizz";
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_7_when_number_is_7(){
        //Given
        int number=7;

        //when
        String when = new FizzBuzz().fizzBuzz(7);
        //result
        String result="7";
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_FizzBuzz_when_number_is_15(){
        //Given
        int number=15;

        //when
        String when = new FizzBuzz().fizzBuzz(15);
        //result
        String result="FizzBuzz";
        //then
        assertThat(result).isEqualTo(when);

    }


}
