package pulse;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class BlockOutlineEvent extends CancellablePulseEvent {
   private final MatrixStack matrices;
   private final VertexConsumer vertexConsumer;
   private final Entity entity;
   private final double cameraX;
   private final double cameraY;
   private final double cameraZ;
   private final BlockPos blockPos;
   private final BlockState blockState;

   public BlockOutlineEvent(
      MatrixStack matrices,
      VertexConsumer vertexConsumer,
      Entity entity,
      double cameraX,
      double cameraY,
      double cameraZ,
      BlockPos blockPos,
      BlockState blockState
   ) {
      this.matrices = matrices;
      this.vertexConsumer = vertexConsumer;
      this.entity = entity;
      this.cameraX = cameraX;
      this.cameraY = cameraY;
      this.cameraZ = cameraZ;
      this.blockPos = blockPos;
      this.blockState = blockState;
   }

   public MatrixStack matrices() {
      return this.matrices;
   }

   public VertexConsumer vertexConsumer() {
      return this.vertexConsumer;
   }

   public Entity entity() {
      return this.entity;
   }

   public double cameraX() {
      return this.cameraX;
   }

   public double cameraY() {
      return this.cameraY;
   }

   public double cameraZ() {
      return this.cameraZ;
   }

   public BlockPos blockPos() {
      return this.blockPos;
   }

   public BlockState blockState() {
      return this.blockState;
   }

   public MatrixStack d() {
      return this.matrices;
   }

   public VertexConsumer e() {
      return this.vertexConsumer;
   }

   public Entity f() {
      return this.entity;
   }

   public double g() {
      return this.cameraX;
   }

   public double h() {
      return this.cameraY;
   }

   public double i() {
      return this.cameraZ;
   }

   public BlockPos j() {
      return this.blockPos;
   }

   public BlockState k() {
      return this.blockState;
   }
}

