package pulse;

public class MovementInputEvent extends CancellablePulseEvent {
   private float forward;
   private float sideways;
   private boolean jumping;
   private boolean sneaking;
   private double sneakSlowdownMultiplier;

   public MovementInputEvent(float forward, float sideways, boolean jumping, boolean sneaking, double sneakSlowdownMultiplier) {
      this.forward = forward;
      this.sideways = sideways;
      this.jumping = jumping;
      this.sneaking = sneaking;
      this.sneakSlowdownMultiplier = sneakSlowdownMultiplier;
   }

   public float forward() {
      return this.forward;
   }

   public float sideways() {
      return this.sideways;
   }

   public boolean jumping() {
      return this.jumping;
   }

   public boolean sneaking() {
      return this.sneaking;
   }

   public double sneakSlowdownMultiplier() {
      return this.sneakSlowdownMultiplier;
   }

   public void setForward(float forward) {
      this.forward = forward;
   }

   public void setSideways(float sideways) {
      this.sideways = sideways;
   }

   public void setJumping(boolean jumping) {
      this.jumping = jumping;
   }

   public void setSneaking(boolean sneaking) {
      this.sneaking = sneaking;
   }

   public void setSneakSlowdownMultiplier(double sneakSlowdownMultiplier) {
      this.sneakSlowdownMultiplier = sneakSlowdownMultiplier;
   }

   public float d() {
      return this.forward;
   }

   public float e() {
      return this.sideways;
   }

   public boolean f() {
      return this.jumping;
   }

   public boolean g() {
      return this.sneaking;
   }

   public double h() {
      return this.sneakSlowdownMultiplier;
   }

   public void a(float forward) {
      this.forward = forward;
   }

   public void b(float sideways) {
      this.sideways = sideways;
   }

   public void b(boolean jumping) {
      this.jumping = jumping;
   }

   public void c(boolean sneaking) {
      this.sneaking = sneaking;
   }

   public void a(double sneakSlowdownMultiplier) {
      this.sneakSlowdownMultiplier = sneakSlowdownMultiplier;
   }
}
