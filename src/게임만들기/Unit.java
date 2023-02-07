package 게임만들기;

public abstract class Unit {
    protected String name; // 캐릭터 이름 설정
    protected int pPower; // 피지컬 Power (물리적인 힘)
    protected int mPower; // 매지컬 Power (마법의 힘)
    protected double pHit; // 물리 적중률
    protected double mHit; // 마법 적중률
    protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
    protected int hp; // 체력

    // 물리 공격력 :물리적인 힘 * 원래는 확률로 계산하는게 원칙이지만 코드를 간단하기 위해서
    public abstract double pAttack();

    // 마법 공격력
    public abstract double mAttack();

    // 궁극기 : 특수 능력
    public abstract int ultimate();

    // 해당 캐릭터가 공격을 받아서 받는 피해량 반영 함
    public abstract boolean setDamage(double damage);
}

interface GameAction {
    double pAttack(); // 구현부가 없고 선언만 있음, 상속 받은 클래스 구현해줘야 함
    double mAttack(); // 마법 공격력
    int ultimate(); // 궁극의 기술로 입히는 공격량(?)
    // 반환 타입이 boolean 이유는 캐릭터의 아직살아 있는지 판별하기 위해서
    // 남아 있는 hp 보다 damage 가 크면 true 를 반환(즉 죽었다는 의미)
    boolean setDamage(double damage); // 피해를 받는량
}
