import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class fractionTest {

    @Test
    public void should_be_fraction_01_when_fraction_01_add_fraction_01(){
        //Given
        Fraction fraction1=new Fraction(0,1);
        Fraction fraction2=new Fraction(0,1);

        //when
         Fraction when = fraction1.add(fraction2);

        //result
       Fraction result =new Fraction(0,1);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_13_when_fraction_13_add_fraction_23(){
        //Given
        Fraction fraction1=new Fraction(1,3);
        Fraction fraction2=new Fraction(1,3);

        //when
        Fraction when = fraction1.add(fraction2);

        //result
        Fraction result =new Fraction(2,3);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_11_when_fraction_11_add_fraction_21(){
        //Given
        Fraction fraction1=new Fraction(1,1);
        Fraction fraction2=new Fraction(1,1);

        //when
        Fraction when = fraction1.add(fraction2);

        //result
        Fraction result =new Fraction(2,1);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_12_when_fraction_13_add_fraction_56(){
        //Given
        Fraction fraction1=new Fraction(1,2);
        Fraction fraction2=new Fraction(1,3);

        //when
        Fraction when = fraction1.add(fraction2);

        //result
        Fraction result =new Fraction(5,6);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_515_when_fraction_515_add_fraction_23(){
        //Given
        Fraction fraction1=new Fraction(5,15);
        Fraction fraction2=new Fraction(5,15);

        //when
        Fraction when =new Fraction(2,3);


        //result
        Fraction result = fraction1.add(fraction2);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_14_when_fraction_16_add_fraction_512(){
        //Given
        Fraction fraction1=new Fraction(1,4);
        Fraction fraction2=new Fraction(1,6);

        //when
        Fraction when =new Fraction(5,12);


        //result
        Fraction result = fraction1.add(fraction2);
        //then
        assertThat(result).isEqualTo(when);

    }

    @Test
    public void should_be_fraction_46_when_fraction_46_add_fraction_43(){
        //Given
        Fraction fraction1=new Fraction(4,6);
        Fraction fraction2=new Fraction(4,6);

        //when
        Fraction when =new Fraction(4,3);


        //result
        Fraction result = fraction1.add(fraction2);
        //then
        assertThat(result).isEqualTo(when);

    }
}
