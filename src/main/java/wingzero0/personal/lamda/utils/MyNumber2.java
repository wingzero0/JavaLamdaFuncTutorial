package wingzero0.personal.lamda.utils;

public class MyNumber2 implements LinkElement2 {
    private MyNumber2 linkToNextNumber;
    private Number numberValue;

    public MyNumber2(Number number) {
        this.setLinkToNextNumber(null);
        this.setNumberValue(number);
    }

    public MyNumber2(MyNumber2 linkToNextNumber, Number numberValue) {
        this.setLinkToNextNumber(linkToNextNumber);
        this.setNumberValue(numberValue);
    }

    public MyNumber2 getLinkToNextNumber() {
        return this.linkToNextNumber;
    }

    public void setLinkToNextNumber(MyNumber2 linkToNextNumber) {
        this.linkToNextNumber = linkToNextNumber;
    }

    public Number getNumberValue() {
        return this.numberValue;
    }

    public void setNumberValue(Number numberValue) {
        this.numberValue = numberValue;
    }

    @Override
    public boolean hasNext() {
        return linkToNextNumber != null;
    }

    @Override
    public LinkElement2 getNext() {
        return linkToNextNumber;
    }

    @Override
    public LinkElement2 getCurrent() {
        return this;
    }
}
