package pulse;


import pulse.client.MinecraftContext;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.HashSet;
import lombok.Generated;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

public final class WorldRenderUtils implements MinecraftContext {
   private static final Tessellator e = Tessellator.getInstance();
   private static final Identifier f;
   public static int a;
   public static boolean b;

   public static void a(MatrixStack var0, Vec3d var1, float var2, int var3, Identifier var4, float var5, boolean var6) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      int var10000 = (int)7645580427030646883L;
      int var18 = 52389675;
      int var17 = var10000;
      var10000 = var17 & ~var18 | ~var17 & var18;
      var18 = -305645752;
      var17 = var10000;
      RenderSystem.setShaderTexture((var17 | var18) - (var17 & var18), var4);
      var0.push();
      RenderSystem.disableCull();
      if (!var6) {
         var10000 = (int)-4477625509682791071L;
         var18 = 608353637;
         var17 = var10000;
         var10000 = (var17 | var18) & ~(var17 & var18);
         var18 = -1369210876;
         var17 = var10000;
         GL11.glDepthMask(pulse.Bool.from((var17 | var18) - (var17 & var18)));
      } else {
         RenderSystem.disableDepthTest();
         var10000 = (int)-4697343027165029059L;
         var18 = -84884526;
         var17 = var10000;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = 2136694511;
         var17 = var10000;
         GL11.glDepthMask(pulse.Bool.from(var17 & (var18 ^ -1) | (var17 ^ -1) & var18));
      }

      RenderSystem.enableBlend();
      var18 = -2107799507;
      var17 = 218645277;
      int var10001 = (var17 | var18) - (var17 & var18);
      var18 = -1890202848;
      var17 = var10001;
      var10000 = var3 >> var17 + var18 - 2 * (var17 & var18);
      var10001 = (int)1953754785692418770L;
      var18 = -1727397027;
      var17 = var10001;
      var10001 = (var17 | var18) & ~(var17 & var18);
      var18 = -765427344;
      var17 = var10001;
      var18 = var17 + var18 - 2 * (var17 & var18);
      var17 = var10000;
      int var7 = (~var17 | var18) - ~var17;
      var18 = -1009496147;
      var17 = -1684310757;
      var10001 = var17 & ~var18 | ~var17 & var18;
      var18 = 1481587390;
      var17 = var10001;
      var10000 = var3 >> ((var17 | var18) & (~var17 | ~var18));
      var10001 = (int)-333248128034671932L;
      var18 = 1058206907;
      var17 = var10001;
      var10001 = var17 + var18 - 2 * (var17 & var18);
      var18 = -444660096;
      var17 = var10001;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10000;
      int var8 = (~var17 | var18) - ~var17;
      var18 = -361529853;
      var17 = 1087747551;
      var10001 = (var17 | var18) - (var17 & var18);
      var18 = -1431909597;
      var17 = var10001;
      var18 = (var17 | var18) & ~(var17 & var18);
      var17 = var3;
      int var9 = (~var17 | var18) - ~var17;
      var10001 = (int)4780965961673395242L;
      var18 = 682910399;
      var17 = var10001;
      var10001 = var17 & ~var18 | ~var17 & var18;
      var18 = 208842381;
      var17 = var10001;
      var10000 = var3 >> ((var17 | var18) & ~(var17 & var18));
      var10001 = (int)4890696095887724832L;
      var18 = 1538430656;
      var17 = var10001;
      var10001 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1334474977;
      var17 = var10001;
      var18 = (var17 | var18) - (var17 & var18);
      var17 = var10000;
      int var10 = (~var17 | var18) - ~var17;
      var18 = 1070978242;
      var17 = 124481352;
      var10000 = (var17 | var18) - (var17 & var18);
      var18 = 952023176;
      var17 = var10000;
      var10000 = var17 + var18 - 2 * (var17 & var18);
      var18 = 44188933;
      var17 = -199600589;
      var10001 = (var17 | var18) & ~(var17 & var18);
      var18 = -155709387;
      var17 = var10001;
      RenderSystem.blendFunc(var10000, (var17 | var18) & (~var17 | ~var18));
      Vec3d var11 = c.getEntityRenderDispatcher().camera.getPos();
      var0.translate(-var11.x + var1.x, -var11.y + var1.y, -var11.z + var1.z);
      var0.multiply(c.getEntityRenderDispatcher().getRotation());
      var0.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(var5));
      var0.scale(var2, var2, var2);
      BufferBuilder var12 = e.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      float var125 = var7;
      String var142 = "bxy";
      float var13 = var125 / 255.0F;
      float var126 = var8;
      String var143 = "bxz";
      float var14 = var126 / 255.0F;
      float var127 = var9;
      String var144 = "bya";
      float var15 = var127 / 255.0F;
      float var128 = var10;
      String var145 = "byb";
      float var16 = var128 / 255.0F;
      Matrix4f var146 = var0.peek().getPositionMatrix();
      var18 = 1705261038;
      var17 = 1265298032;
      int var10002 = (var17 | var18) & (~var17 | ~var18);
      var18 = 1212137340;
      var17 = var10002;
      var10002 = var17 & ~var18 | ~var17 & var18;
      int var10003 = (int)1900006930125549570L;
      var18 = -1829947235;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var18 = -187947349;
      var17 = var10003;
      var18 = var17 & ~var18 | ~var17 & var18;
      var17 = var10002;
      var10002 = (var17 & ~var18) + (var18 & ~var17) + 2 * (var17 & var18);
      var10003 = (int)6113193668829864050L;
      var18 = 268263901;
      var17 = var10003;
      var10003 = (var17 | var18) & ~(var17 & var18);
      var18 = -1301556256;
      var17 = var10003;
      var10003 = (var17 | var18) & (~var17 | ~var18);
      var12.vertex(var146, -0.5F, -0.5F, 0.0F).texture(0.0F, 0.0F).color(var13, var14, var15, var16);
      Matrix4f var147 = var0.peek().getPositionMatrix();
      var10002 = (int)2860463375662848976L;
      var18 = 2068302674;
      var17 = var10002;
      var10002 = (var17 | var18) & ~(var17 & var18);
      var18 = -1570662887;
      var17 = var10002;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      String var163 = "byc";
      var12.vertex(var147, 0.5F, -0.5F, 0.0F).texture(1.0F, 0.0F).color(var13, var14, var15, var16);
      Matrix4f var148 = var0.peek().getPositionMatrix();
      var18 = 568469286;
      var17 = -1445708859;
      var10002 = var17 & ~var18 | ~var17 & var18;
      var18 = -936448867;
      var17 = var10002;
      var10002 = (var17 & ~var18 | ~var17 & var18) * (var17 & ~var18 | ~var17 & var18);
      var18 = -1961061936;
      var17 = -1538393823;
      var10003 = (var17 | var18) - (var17 & var18);
      var18 = -340586892;
      var17 = var10003;
      var10003 = var17 + var18 - 2 * (var17 & var18);
      var12.vertex(var148, 0.5F, 0.5F, 0.0F).texture(1.0F, 1.0F).color(var13, var14, var15, var16);
      Matrix4f var149 = var0.peek().getPositionMatrix();
      var18 = 1572572108;
      var17 = -1520969921;
      var10002 = var17 + var18 - 2 * (var17 & var18);
      var18 = -1229959344;
      var17 = var10002;
      var10002 = ((var17 | var18) & (~var17 | ~var18)) * ((var17 | var18) & (~var17 | ~var18));
      var10003 = (int)-1612523727700350785L;
      var18 = 418177821;
      var17 = var10003;
      var10003 = var17 & ~var18 | ~var17 & var18;
      var18 = 2081699542;
      var17 = var10003;
      var10003 = (var17 + var18 - 2 * (var17 & var18)) * (var17 + var18 - 2 * (var17 & var18));
      var12.vertex(var149, -0.5F, 0.5F, 0.0F).texture(0.0F, 1.0F).color(var13, var14, var15, var16);
      BufferRenderer.drawWithGlobalProgram(var12.end());
      if (!var6) {
         var18 = -1849886419;
         var17 = 1721800812;
         var10000 = var17 + var18 - 2 * (var17 & var18);
         var18 = -149135040;
         var17 = var10000;
         GL11.glDepthMask(pulse.Bool.from((var17 | var18) - (var17 & var18)));
      } else {
         RenderSystem.enableDepthTest();
         var18 = -1165820756;
         var17 = 1320544909;
         var10000 = (var17 | var18) & (~var17 | ~var18);
         var18 = -197716448;
         var17 = var10000;
         GL11.glDepthMask(pulse.Bool.from((var17 | var18) & (var17 ^ -1 | var18 ^ -1)));
      }

      RenderSystem.enableCull();
      var0.pop();
   }

   public static void a(MatrixStack var0, Vec3d var1, float var2, int var3) {
      int var10000 = (int)-2620669625615663305L;
      int var17 = 1938419093;
      int var16 = var10000;
      var10000 = (var16 | var17) & ~(var16 & var17);
      var17 = 806113954;
      var16 = var10000;
      RenderSystem.setShaderTexture(var16 & ~var17 | ~var16 & var17, f);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      var0.push();
      RenderSystem.disableCull();
      var17 = 1967813638;
      var16 = 1716506930;
      var10000 = (var16 | var17) & (~var16 | ~var17);
      var17 = 319137076;
      var16 = var10000;
      GL11.glDepthMask(pulse.Bool.from((var16 | var17) & (var16 & var17 ^ -1)));
      RenderSystem.enableBlend();
      int var10001 = (int)2660858175702729697L;
      var17 = 1231621186;
      var16 = var10001;
      var10001 = (var16 | var17) & ~(var16 & var17);
      var17 = -249720909;
      var16 = var10001;
      var10000 = var3 >> (var16 & ~var17 | ~var16 & var17);
      var17 = -358265035;
      var16 = 1500169665;
      var10001 = var16 + var17 - 2 * (var16 & var17);
      var17 = -1278244341;
      var16 = var10001;
      var17 = var16 & ~var17 | ~var16 & var17;
      var16 = var10000;
      int var4 = (~var16 | var17) - ~var16;
      var10001 = (int)7546781782619714904L;
      var17 = 897662964;
      var16 = var10001;
      var10001 = (var16 | var17) & (~var16 | ~var17);
      var17 = -1007760732;
      var16 = var10001;
      var10000 = var3 >> (var16 & ~var17 | ~var16 & var17);
      var17 = 2029988079;
      var16 = 243270645;
      var10001 = var16 + var17 - 2 * (var16 & var17);
      var17 = 1988045797;
      var16 = var10001;
      var17 = var16 + var17 - 2 * (var16 & var17);
      var16 = var10000;
      int var5 = (~var16 | var17) - ~var16;
      var10001 = (int)5664150185638121466L;
      var17 = 1457915409;
      var16 = var10001;
      var10001 = var16 & ~var17 | ~var16 & var17;
      var17 = 797591828;
      var16 = var10001;
      var17 = (var16 | var17) & (~var16 | ~var17);
      var16 = var3;
      int var6 = (~var16 | var17) - ~var16;
      var17 = -2030819809;
      var16 = 170942441;
      var10001 = var16 + var17 - 2 * (var16 & var17);
      var17 = -1933280786;
      var16 = var10001;
      var10000 = var3 >> (var16 | var17) - (var16 & var17);
      var10001 = (int)-2403220145155765516L;
      var17 = 897265180;
      var16 = var10001;
      var10001 = var16 & ~var17 | ~var16 & var17;
      var17 = -141122537;
      var16 = var10001;
      var17 = (var16 | var17) - (var16 & var17);
      var16 = var10000;
      int var7 = (~var16 | var17) - ~var16;
      var17 = var5;
      var16 = var4;
      var10000 = (var16 ^ var17) + 2 * (var16 & var17);
      var17 = var6;
      var16 = var10000;
      float var315 = var16 - ~var17 - 1;
      var17 = -2063155183;
      var16 = -577115380;
      int var10002 = (var16 | var17) - (var16 & var17);
      var17 = 1486826261;
      var16 = var10002;
      var10002 = (var16 | var17) & ~(var16 & var17);
      var10002 = (int)-7894852301174334421L;
      var17 = -1307967169;
      var16 = var10002;
      var10002 = var16 + var17 - 2 * (var16 & var17);
      var17 = -1738662626;
      var16 = var10002;
      var10002 = (var16 | var17) & (~var16 | ~var17);
      var10002 = (int)7590673066575602822L;
      var17 = 1952664165;
      var16 = var10002;
      var10002 = (var16 | var17) & ~(var16 & var17);
      var17 = -1354862879;
      var16 = var10002;
      var10002 = (var16 | var17) & ~(var16 & var17);
      float var8 = var315 / 765.0F;
      String var344 = "byd";
      if (!(var8 < 0.2F)) {
         var17 = -84128254;
         var16 = 2077681779;
         var10000 = (var16 | var17) & (~var16 | ~var17);
         var17 = -2127911565;
         var16 = var10000;
         var10000 = (var16 | var17) & (~var16 | ~var17);
         var10001 = (int)-6178093606417753125L;
         var17 = -1755342535;
         var16 = var10001;
         var10001 = (var16 | var17) & (~var16 | ~var17);
         var17 = -2029780253;
         var16 = var10001;
         RenderSystem.blendFunc(var10000, (var16 | var17) - (var16 & var17));
         Vec3d var9 = c.getEntityRenderDispatcher().camera.getPos();
         var0.translate(-var9.x + var1.x, -var9.y + var1.y, -var9.z + var1.z);
         var0.multiply(c.getEntityRenderDispatcher().getRotation());
         var0.scale(var2, var2, var2);
         BufferBuilder var10 = e.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         float var318 = var4;
         String var347 = "byk";
         float var11 = var318 / 255.0F;
         float var319 = var5;
         String var348 = "byl";
         float var12 = var319 / 255.0F;
         float var320 = var6;
         var10001 = (int)5735158622209916779L;
         var17 = 1765002530;
         var16 = var10001;
         var10001 = var16 & ~var17 | ~var16 & var17;
         var17 = 1889459114;
         var16 = var10001;
         var10001 = (var16 | var17) - (var16 & var17);
         var10002 = (int)-8113756197233322830L;
         var17 = 2087753293;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = 767350257;
         var16 = var10002;
         var17 = (var16 | var17) - (var16 & var17);
         var16 = var10001;
         var10001 = (var16 ^ var17) + 2 * (var16 & var17);
         float var13 = var320 / 255.0F;
         float var321 = var7;
         String var353 = "bym";
         float var14 = var321 / 255.0F;
         Matrix4f var354 = var0.peek().getPositionMatrix();
         var10002 = (int)7873724471118302765L;
         var17 = 1997084062;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = 2014131640;
         var16 = var10002;
         var10002 = ((var16 | var17) & ~(var16 & var17)) * ((var16 | var17) & ~(var16 & var17));
         int var10003 = (int)-4965197325591448190L;
         var17 = 282948051;
         var16 = var10003;
         var10003 = var16 + var17 - 2 * (var16 & var17);
         var17 = 1450770078;
         var16 = var10003;
         var10003 = var16 & ~var17 | ~var16 & var17;
         var10.vertex(var354, -0.5F, -0.5F, 0.0F).texture(0.0F, 0.0F).color(var11, var12, var13, var14);
         Matrix4f var355 = var0.peek().getPositionMatrix();
         String var398 = "byn";
         var17 = 1843525192;
         var16 = -37926377;
         int var10004 = var16 & ~var17 | ~var16 & var17;
         var17 = -1872970672;
         var16 = var10004;
         var10004 = (var16 | var17) - (var16 & var17);
         var10004 = (int)-6713148727179893703L;
         var17 = -1143041843;
         var16 = var10004;
         var10004 = var16 + var17 - 2 * (var16 & var17);
         var17 = 1405957366;
         var16 = var10004;
         var10004 = (var16 | var17) & ~(var16 & var17);
         var17 = 164767325;
         var16 = -21238833;
         var10004 = (var16 | var17) & (~var16 | ~var17);
         var17 = -144061037;
         var16 = var10004;
         var10004 = var16 + var17 - 2 * (var16 & var17);
         var10.vertex(var355, 0.5F, -0.5F, 0.0F).texture(1.0F, 0.0F).color(var11, var12, var13, var14);
         Matrix4f var356 = var0.peek().getPositionMatrix();
         String var399 = "byo";
         String var445 = "byp";
         var10.vertex(var356, 0.5F, 0.5F, 0.0F).texture(1.0F, 1.0F).color(var11, var12, var13, var14);
         Matrix4f var357 = var0.peek().getPositionMatrix();
         var17 = 52898022;
         var16 = 731653839;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = -2057950112;
         var16 = var10002;
         var10002 = var16 + var17 - 2 * (var16 & var17);
         String var446 = "byq";
         var10.vertex(var357, -0.5F, 0.5F, 0.0F).texture(0.0F, 1.0F).color(var11, var12, var13, var14);
         BufferRenderer.drawWithGlobalProgram(var10.end());
         var17 = 1276750386;
         var16 = 700252508;
         var10000 = (var16 | var17) - (var16 & var17);
         var17 = 1705289836;
         var16 = var10000;
         var10000 = (var16 | var17) & (~var16 | ~var17);
         var10001 = (int)3773383826348872458L;
         var17 = -1974024610;
         var16 = var10001;
         var10001 = (var16 | var17) & (~var16 | ~var17);
         var17 = -2131995049;
         var16 = var10001;
         RenderSystem.blendFunc(var10000, (var16 | var17) - (var16 & var17));
      } else {
         var10000 = (int)-2785166030400635377L;
         var17 = 817168602;
         var16 = var10000;
         var10000 = (var16 | var17) & (~var16 | ~var17);
         var17 = 1170816471;
         var16 = var10000;
         var10000 = (var16 | var17) & ~(var16 & var17);
         var17 = -2145992768;
         var16 = 2094993225;
         var10001 = (var16 | var17) - (var16 & var17);
         var17 = -53890166;
         var16 = var10001;
         RenderSystem.blendFunc(var10000, var16 & ~var17 | ~var16 & var17);
         Vec3d var18 = c.getEntityRenderDispatcher().camera.getPos();
         var0.translate(-var18.x + var1.x, -var18.y + var1.y, -var18.z + var1.z);
         var0.multiply(c.getEntityRenderDispatcher().getRotation());
         var10002 = (int)1003121368116774335L;
         var17 = 324515700;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = 1381040775;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         float var361 = var2 * 1.2F;
         var17 = -1214982849;
         var16 = -1922328072;
         int var475 = var16 + var17 - 2 * (var16 & var17);
         var17 = 989809862;
         var16 = var475;
         var475 = var16 + var17 - 2 * (var16 & var17);
         float var405 = var2 * 1.2F;
         String var477 = "bye";
         var0.scale(var361, var405, var2 * 1.2F);
         BufferBuilder var19 = e.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         float var327 = var7;
         var10002 = (int)-3751581907969620186L;
         var17 = -2055964648;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = 549732141;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var10002 = (int)1797778231059334356L;
         var17 = 2044219808;
         var16 = var10002;
         var10002 = var16 + var17 - 2 * (var16 & var17);
         var17 = -689924747;
         var16 = var10002;
         var10002 = (var16 | var17) & ~(var16 & var17);
         var10002 = (int)6727271689544124831L;
         var17 = -161740963;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = 1955450576;
         var16 = var10002;
         var10002 = (var16 | var17) & (~var16 | ~var17);
         float var328 = var327 / 255.0F;
         var10001 = (int)5220444004311069509L;
         var17 = -1663222343;
         var16 = var10001;
         var10001 = (var16 | var17) & ~(var16 & var17);
         var17 = 1529917935;
         var16 = var10001;
         var10001 = ((var16 | var17) - (var16 & var17)) * ((var16 | var17) - (var16 & var17));
         float var21 = var328 * 0.3F;
         Matrix4f var365 = var0.peek().getPositionMatrix();
         String var415 = "byf";
         var475 = (int)-8564511819156589969L;
         var17 = 1210186189;
         var16 = var475;
         var475 = (var16 | var17) & ~(var16 & var17);
         var17 = -660042834;
         var16 = var475;
         var475 = var16 & ~var17 | ~var16 & var17;
         var17 = 359639567;
         var16 = 105315384;
         var475 = var16 & ~var17 | ~var16 & var17;
         var17 = 321476135;
         var16 = var475;
         var475 = var16 & ~var17 | ~var16 & var17;
         var19.vertex(var365, -0.5F, -0.5F, 0.0F).texture(0.0F, 0.0F).color(1.0F, 1.0F, 1.0F, var21);
         Matrix4f var366 = var0.peek().getPositionMatrix();
         var10002 = (int)-6814141903106070856L;
         var17 = 18001884;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = 1048260941;
         var16 = var10002;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = -257941348;
         var16 = 2008803486;
         int var447 = var16 & ~var17 | ~var16 & var17;
         var17 = -1351058325;
         var16 = var447;
         var17 = (var16 | var17) - (var16 & var17);
         var16 = var10002;
         var10002 = 2 * (var16 | var17) - (var16 ^ var17);
         String var448 = "byg";
         var19.vertex(var366, 0.5F, -0.5F, 0.0F).texture(1.0F, 0.0F).color(1.0F, 1.0F, 1.0F, var21);
         Matrix4f var367 = var0.peek().getPositionMatrix();
         var17 = -360019849;
         var16 = -1454345518;
         var10002 = var16 & ~var17 | ~var16 & var17;
         var17 = 1756089859;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = 264705246;
         var16 = -1765913054;
         var447 = (var16 | var17) - (var16 & var17);
         var17 = 1471294242;
         var16 = var447;
         var17 = (var16 | var17) & ~(var16 & var17);
         var16 = var10002;
         var10002 = (var16 | var17) + (var16 & var17);
         var447 = (int)1773302902229290688L;
         var17 = -1632161907;
         var16 = var447;
         var447 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1264399905;
         var16 = var447;
         var447 = ((var16 | var17) & (~var16 | ~var17)) * ((var16 | var17) & (~var16 | ~var17));
         var19.vertex(var367, 0.5F, 0.5F, 0.0F).texture(1.0F, 1.0F).color(1.0F, 1.0F, 1.0F, var21);
         Matrix4f var368 = var0.peek().getPositionMatrix();
         String var423 = "byh";
         var17 = -1532328121;
         var16 = -675528881;
         var447 = (var16 | var17) - (var16 & var17);
         var17 = -1585263172;
         var16 = var447;
         var447 = var16 & ~var17 | ~var16 & var17;
         var17 = -320977636;
         var16 = -1195370304;
         var475 = var16 & ~var17 | ~var16 & var17;
         var17 = 710622870;
         var16 = var475;
         var17 = var16 + var17 - 2 * (var16 & var17);
         var16 = var447;
         var447 = (var16 ^ var17) + 2 * (var16 & var17);
         var19.vertex(var368, -0.5F, 0.5F, 0.0F).texture(0.0F, 1.0F).color(1.0F, 1.0F, 1.0F, var21);
         BufferRenderer.drawWithGlobalProgram(var19.end());
         var10001 = (int)-6140593506255533174L;
         var17 = -925909175;
         var16 = var10001;
         var10001 = var16 & ~var17 | ~var16 & var17;
         var17 = -2047602303;
         var16 = var10001;
         var10001 = (var16 | var17) & (~var16 | ~var17);
         String var424 = "byi";
         var17 = -1868881005;
         var16 = 609800806;
         var447 = var16 + var17 - 2 * (var16 & var17);
         var17 = -399701083;
         var16 = var447;
         var447 = (var16 | var17) - (var16 & var17);
         var0.scale(0.8333333F, 0.8333333F, 0.8333333F);
         var19 = e.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
         float var329 = var4;
         var10001 = (int)-3570145295763487326L;
         var17 = -1416064085;
         var16 = var10001;
         var10001 = (var16 | var17) - (var16 & var17);
         var17 = -353670542;
         var16 = var10001;
         var10001 = var16 & ~var17 | ~var16 & var17;
         var10002 = (int)-5474094372484933585L;
         var17 = -2036769808;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = 1682334553;
         var16 = var10002;
         var17 = var16 + var17 - 2 * (var16 & var17);
         var16 = var10001;
         var10001 = (var16 & ~var17) + (var17 & ~var16) + 2 * (var16 & var17);
         float var22 = var329 / 255.0F;
         float var330 = var5;
         var10002 = (int)1136134526579235141L;
         var17 = -1430776896;
         var16 = var10002;
         var10002 = (var16 | var17) & ~(var16 & var17);
         var17 = -1283995002;
         var16 = var10002;
         var10002 = var16 + var17 - 2 * (var16 & var17);
         var17 = -983402078;
         var16 = -76300146;
         var10002 = var16 + var17 - 2 * (var16 & var17);
         var17 = 1041348902;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         float var23 = var330 / 255.0F;
         float var331 = var6;
         var10001 = (int)-3142590922798207557L;
         var17 = -224426644;
         var16 = var10001;
         var10001 = (var16 | var17) - (var16 & var17);
         var17 = -1277588655;
         var16 = var10001;
         var10001 = (var16 | var17) - (var16 & var17);
         float var24 = var331 / 255.0F;
         float var332 = var7;
         var17 = 732830034;
         var16 = 1889666319;
         var10001 = var16 + var17 - 2 * (var16 & var17);
         var17 = 1577028617;
         var16 = var10001;
         var10001 = (var16 | var17) & ~(var16 & var17);
         var17 = -994232734;
         var16 = -1769215327;
         var10002 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1874756120;
         var16 = var10002;
         var17 = (var16 | var17) - (var16 & var17);
         var16 = var10001;
         var10001 = 2 * (var16 | var17) - (var16 ^ var17);
         float var15 = var332 / 255.0F;
         Matrix4f var382 = var0.peek().getPositionMatrix();
         String var433 = "byj";
         var17 = -327548173;
         var16 = -2081596821;
         var475 = (var16 | var17) - (var16 & var17);
         var17 = 1872189594;
         var16 = var475;
         var475 = (var16 | var17) - (var16 & var17);
         var17 = 1092398776;
         var16 = -418685445;
         var475 = (var16 | var17) & (~var16 | ~var17);
         var17 = -1508379834;
         var16 = var475;
         var475 = var16 & ~var17 | ~var16 & var17;
         var475 = (int)8037764204357674047L;
         var17 = -267830344;
         var16 = var475;
         var475 = var16 + var17 - 2 * (var16 & var17);
         var17 = -853549172;
         var16 = var475;
         var475 = (var16 | var17) & (~var16 | ~var17);
         var17 = 902547270;
         var16 = 209856183;
         var475 = (var16 | var17) - (var16 & var17);
         var17 = 961143292;
         var16 = var475;
         var475 = (var16 | var17) - (var16 & var17);
         var19.vertex(var382, -0.5F, -0.5F, 0.0F).texture(0.0F, 0.0F).color(var22, var23, var24, var15);
         Matrix4f var383 = var0.peek().getPositionMatrix();
         var10002 = (int)-3240034164943677663L;
         var17 = 786021359;
         var16 = var10002;
         var10002 = (var16 | var17) - (var16 & var17);
         var17 = -604301259;
         var16 = var10002;
         var10002 = (var16 | var17) & (~var16 | ~var17);
         var447 = (int)2520186930511803487L;
         var17 = 2085576485;
         var16 = var447;
         var447 = (var16 | var17) & (~var16 | ~var17);
         var17 = 1701468961;
         var16 = var447;
         var17 = var16 + var17 - 2 * (var16 & var17);
         var16 = var10002;
         var10002 = (var16 | var17) + (var16 & var17);
         var17 = 1484157424;
         var16 = 1333251187;
         var447 = var16 & ~var17 | ~var16 & var17;
         var17 = -973370623;
         var16 = var447;
         var447 = var16 & ~var17 | ~var16 & var17;
         var17 = -59005460;
         var16 = 757817217;
         var475 = var16 & ~var17 | ~var16 & var17;
         var17 = -672815520;
         var16 = var475;
         var17 = (var16 | var17) - (var16 & var17);
         var16 = var447;
         var447 = 2 * (var16 | var17) - (var16 ^ var17);
         var19.vertex(var383, 0.5F, -0.5F, 0.0F).texture(1.0F, 0.0F).color(var22, var23, var24, var15);
         Matrix4f var384 = var0.peek().getPositionMatrix();
         var10002 = (int)-3078963745456626076L;
         var17 = -1401164262;
         var16 = var10002;
         var10002 = (var16 | var17) & (~var16 | ~var17);
         var17 = 1120356999;
         var16 = var10002;
         var10002 = (var16 | var17) & ~(var16 & var17);
         var17 = 1536360916;
         var16 = 656501734;
         var447 = (var16 | var17) & ~(var16 & var17);
         var17 = -270143123;
         var16 = var447;
         var447 = ((var16 | var17) - (var16 & var17)) * ((var16 | var17) - (var16 & var17));
         var19.vertex(var384, 0.5F, 0.5F, 0.0F).texture(1.0F, 1.0F).color(var22, var23, var24, var15);
         Matrix4f var385 = var0.peek().getPositionMatrix();
         var17 = 1122773464;
         var16 = 1096890379;
         var10002 = (var16 | var17) & ~(var16 & var17);
         var17 = -1612655878;
         var16 = var10002;
         var10002 = ((var16 | var17) & (~var16 | ~var17)) * ((var16 | var17) & (~var16 | ~var17));
         var447 = (int)-4228903226703354957L;
         var17 = -1486096499;
         var16 = var447;
         var447 = var16 & ~var17 | ~var16 & var17;
         var17 = 1542468718;
         var16 = var447;
         var447 = var16 + var17 - 2 * (var16 & var17);
         var475 = (int)4243588573944993776L;
         var17 = -921235080;
         var16 = var475;
         var475 = var16 + var17 - 2 * (var16 & var17);
         var17 = -1839107106;
         var16 = var475;
         var17 = (var16 | var17) & ~(var16 & var17);
         var16 = var447;
         var447 = (var16 ^ var17) + 2 * (var16 & var17);
         var19.vertex(var385, -0.5F, 0.5F, 0.0F).texture(0.0F, 1.0F).color(var22, var23, var24, var15);
         BufferRenderer.drawWithGlobalProgram(var19.end());
      }

      var17 = 1509956684;
      var16 = 65289691;
      var10000 = (var16 | var17) & (~var16 | ~var17);
      var17 = 1508123030;
      var16 = var10000;
      GL11.glDepthMask(pulse.Bool.from((var16 | var17) & (var16 & var17 ^ -1)));
      RenderSystem.enableCull();
      var0.pop();
   }

   public static void a(MatrixStack var0, Box var1, int var2) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableDepthTest();
      int var10000 = (int)5817069677716224489L;
      int var24 = -407443823;
      int var23 = var10000;
      var10000 = (var23 | var24) - (var23 & var24);
      var24 = -632397959;
      var23 = var10000;
      RenderSystem.depthMask(pulse.Bool.from(var23 & (var24 ^ -1) | (var23 ^ -1) & var24));
      var24 = -2059898628;
      var23 = -1971321534;
      var10000 = (var23 | var24) & ~(var23 & var24);
      var24 = 263741372;
      var23 = var10000;
      GL11.glEnable(var23 & ~var24 | ~var23 & var24);
      String var107 = "byr";
      int var10001 = (int)-1195339874228647643L;
      var24 = -1509721272;
      var23 = var10001;
      var10001 = (var23 | var24) & ~(var23 & var24);
      var24 = 1473499519;
      var23 = var10001;
      var10001 = (var23 + var24 - 2 * (var23 & var24)) * (var23 + var24 - 2 * (var23 & var24));
      GL11.glPolygonOffset(-1.0F, -1.0F);
      String var108 = "bys";
      RenderSystem.lineWidth(1.5F);
      Tessellator var3 = Tessellator.getInstance();
      Matrix4f var4 = var0.peek().getPositionMatrix();
      Vec3d var5 = c.gameRenderer.getCamera().getPos();
      double var6 = var1.minX - var5.x;
      double var8 = var1.minY - var5.y;
      double var10 = var1.minZ - var5.z;
      double var12 = var1.maxX - var5.x;
      double var14 = var1.maxY - var5.y;
      double var16 = var1.maxZ - var5.z;
      var10001 = (int)1569164004282943792L;
      var24 = -1679322510;
      var23 = var10001;
      var10001 = (var23 | var24) & (~var23 | ~var24);
      var24 = -2038768814;
      var23 = var10001;
      var10000 = var2 >> (var23 | var24) - (var23 & var24);
      var24 = -1184158390;
      var23 = -1909424651;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var24 = 928731200;
      var23 = var10001;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var10000;
      float var110 = (~var23 | var24) - ~var23;
      var24 = -358302811;
      var23 = -988937920;
      var10001 = (var23 | var24) & (~var23 | ~var24);
      var24 = -1276169477;
      var23 = var10001;
      var10001 = var23 + var24 - 2 * (var23 & var24);
      float var18 = var110 / 255.0F;
      var10001 = (int)-1861070490066836221L;
      var24 = 1814293282;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = -2051453399;
      var23 = var10001;
      var10000 = var2 >> (var23 | var24) - (var23 & var24);
      var10001 = (int)823077321544009157L;
      var24 = 887031517;
      var23 = var10001;
      var10001 = (var23 | var24) & ~(var23 & var24);
      var24 = -1181711385;
      var23 = var10001;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var10000;
      float var112 = (~var23 | var24) - ~var23;
      var24 = -985570287;
      var23 = 1216277266;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var24 = -385659977;
      var23 = var10001;
      var10001 = (var23 | var24) & (~var23 | ~var24);
      var24 = -941923326;
      var23 = 1770052226;
      int var10002 = (var23 | var24) & (~var23 | ~var24);
      var24 = 927746660;
      var23 = var10002;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var10001;
      var10001 = var23 - ~var24 - 1;
      float var19 = var112 / 255.0F;
      var24 = 16268709;
      var23 = 656066361;
      var10001 = (var23 | var24) & ~(var23 & var24);
      var24 = 669186659;
      var23 = var10001;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var2;
      float var113 = (~var23 | var24) - ~var23;
      var10001 = (int)3282979918102073591L;
      var24 = 1660671835;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = 921363237;
      var23 = var10001;
      var10001 = ((var23 | var24) & ~(var23 & var24)) * ((var23 | var24) & ~(var23 & var24));
      float var20 = var113 / 255.0F;
      var24 = 91882182;
      var23 = 609020687;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = 557246929;
      var23 = var10001;
      var10000 = var2 >> (var23 | var24) - (var23 & var24);
      var24 = -537161653;
      var23 = -1658639256;
      var10001 = (var23 | var24) & (~var23 | ~var24);
      var24 = 1121500380;
      var23 = var10001;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var10000;
      float var115 = (~var23 | var24) - ~var23;
      var10001 = (int)2965514030620798072L;
      var24 = 1593916305;
      var23 = var10001;
      var10001 = (var23 | var24) & (~var23 | ~var24);
      var24 = -1026180995;
      var23 = var10001;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var10002 = (int)-7758695098290190214L;
      var24 = -1897730611;
      var23 = var10002;
      var10002 = var23 + var24 - 2 * (var23 & var24);
      var24 = -907750051;
      var23 = var10002;
      var24 = (var23 | var24) & ~(var23 & var24);
      var23 = var10001;
      var10001 = (var23 ^ var24) + 2 * (var23 & var24);
      float var21 = var115 / 255.0F;
      if (var21 == 0.0F) {
         var21 = 1.0F;
      }

      BufferBuilder var22 = var3.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
      var22.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var22.end());
      var22 = var3.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
      var22.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var22.end());
      var22 = var3.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      var22.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var22.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var22.end());
      GL11.glPolygonOffset(0.0F, 0.0F);
      var24 = 482553962;
      var23 = -1518876518;
      var10000 = var23 & ~var24 | ~var23 & var24;
      var24 = -1179331854;
      var23 = var10000;
      GL11.glDisable((var23 | var24) & (~var23 | ~var24));
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableBlend();
      var0.pop();
   }

   public static void a(MatrixStack var0, Vec3d var1, float var2, int var3, int var4, float var5) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableDepthTest();
      int var10000 = (int)-6320867661711466101L;
      int var24 = -1134439827;
      int var23 = var10000;
      var10000 = (var23 | var24) - (var23 & var24);
      var24 = 1661924327;
      var23 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var23 | var24) & (var23 & var24 ^ -1)));
      var10000 = (int)7221812832778364214L;
      var24 = -991562387;
      var23 = var10000;
      var10000 = (var23 | var24) - (var23 & var24);
      var24 = -252085671;
      var23 = var10000;
      GL11.glEnable(var23 & ~var24 | ~var23 & var24);
      String var98 = "byt";
      String var10001 = "byu";
      GL11.glPolygonOffset(-1.0F, -1.0F);
      String var99 = "byv";
      RenderSystem.lineWidth(1.5F);
      Tessellator var6 = Tessellator.getInstance();
      Matrix4f var7 = var0.peek().getPositionMatrix();
      Vec3d var8 = c.gameRenderer.getCamera().getPos();
      int var110 = (int)5434377142697162512L;
      var24 = 1207107910;
      var23 = var110;
      int var111 = (var23 | var24) & ~(var23 & var24);
      var24 = -1174112698;
      var23 = var111;
      var10000 = var4 >> (var23 | var24) - (var23 & var24);
      int var112 = (int)-6646883817153490484L;
      var24 = -1348577130;
      var23 = var112;
      int var113 = (var23 | var24) - (var23 & var24);
      var24 = 551045541;
      var23 = var113;
      var24 = (var23 | var24) & (~var23 | ~var24);
      var23 = var10000;
      float var101 = (~var23 | var24) - ~var23;
      int var114 = (int)4842691733112966535L;
      var24 = -925021575;
      var23 = var114;
      int var115 = var23 + var24 - 2 * (var23 & var24);
      var24 = -805341021;
      var23 = var115;
      int var116 = var23 + var24 - 2 * (var23 & var24);
      float var9 = var101 / 255.0F;
      var24 = 403305279;
      var23 = -1507895437;
      int var117 = var23 + var24 - 2 * (var23 & var24);
      var24 = -1105812412;
      var23 = var117;
      var10000 = var4 >> ((var23 | var24) & (~var23 | ~var24));
      var24 = -1595746791;
      var23 = -591936231;
      int var118 = (var23 | var24) - (var23 & var24);
      var24 = 2085950463;
      var23 = var118;
      var24 = (var23 | var24) - (var23 & var24);
      var23 = var10000;
      float var103 = (~var23 | var24) - ~var23;
      var24 = 1954945715;
      var23 = -64770735;
      int var10002 = (var23 | var24) - (var23 & var24);
      var24 = -2002405397;
      var23 = var10002;
      var10002 = (var23 | var24) & ~(var23 & var24);
      var24 = -1941984484;
      var23 = 1785602738;
      var10002 = var23 & ~var24 | ~var23 & var24;
      var24 = -430863954;
      var23 = var10002;
      var10002 = var23 & ~var24 | ~var23 & var24;
      float var10 = var103 / 255.0F;
      var24 = 1002009231;
      var23 = 1297068585;
      int var119 = var23 + var24 - 2 * (var23 & var24);
      var24 = 1995882585;
      var23 = var119;
      var24 = (var23 | var24) & (~var23 | ~var24);
      var23 = var4;
      float var104 = (~var23 | var24) - ~var23;
      var24 = 772076714;
      var23 = -548682519;
      int var120 = (var23 | var24) - (var23 & var24);
      var24 = -143874009;
      var23 = var120;
      int var121 = var23 & ~var24 | ~var23 & var24;
      float var11 = var104 / 255.0F;
      var24 = -293822574;
      var23 = -1426078654;
      int var122 = var23 + var24 - 2 * (var23 & var24);
      var24 = 1149459400;
      var23 = var122;
      var10000 = var4 >> ((var23 | var24) & (~var23 | ~var24));
      int var123 = (int)-5071817812107174788L;
      var24 = -494594294;
      var23 = var123;
      int var124 = (var23 | var24) & (~var23 | ~var24);
      var24 = -1386263671;
      var23 = var124;
      var24 = (var23 | var24) & ~(var23 & var24);
      var23 = var10000;
      float var106 = (~var23 | var24) - ~var23;
      var24 = -2069308612;
      var23 = -1671683175;
      int var125 = var23 + var24 - 2 * (var23 & var24);
      var24 = -162255477;
      var23 = var125;
      int var126 = var23 + var24 - 2 * (var23 & var24);
      float var12 = var106 / 255.0F;
      if (var12 == 0.0F) {
         var12 = 1.0F;
      }

      BufferBuilder var13 = var6.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
      var24 = -1117258182;
      var23 = -2026744074;
      var10000 = (var23 | var24) & (~var23 | ~var24);
      var24 = 978692300;
      var23 = var10000;

      for (int var14 = (var23 | var24) & ~(var23 & var24); var14 <= var3; var14++) {
         String var108 = "byw";
         double var15 = (Math.PI * 2) * var14 / var3;
         double var17 = var1.x + var2 * Math.cos(var15) - var8.x;
         double var19 = var1.z + var2 * Math.sin(var15) - var8.z;
         double var21 = var1.y + var5 + 1.0 - var8.y;
         var13.vertex(var7, (float)var17, (float)var21, (float)var19).color(var9, var10, var11, var12);
      }

      BufferRenderer.drawWithGlobalProgram(var13.end());
      GL11.glPolygonOffset(0.0F, 0.0F);
      var24 = 1720329464;
      var23 = -853407592;
      var10000 = (var23 | var24) & ~(var23 & var24);
      var24 = -1415051678;
      var23 = var10000;
      GL11.glDisable(var23 + var24 - 2 * (var23 & var24));
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableBlend();
      var0.pop();
   }

   public static void a(MatrixStack var0, Vec3d var1, float var2, int var3, int var4) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      int var10000 = (int)7444354063098407065L;
      int var27 = 1926934287;
      int var26 = var10000;
      var10000 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1810745238;
      var26 = var10000;
      RenderSystem.depthMask(pulse.Bool.from(var26 + var27 - 2 * (var26 & var27)));
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Tessellator var5 = Tessellator.getInstance();
      Matrix4f var6 = var0.peek().getPositionMatrix();
      Vec3d var7 = c.gameRenderer.getCamera().getPos();
      var27 = 768848912;
      var26 = -25264788;
      int var10001 = (var26 | var27) - (var26 & var27);
      var27 = -743585428;
      var26 = var10001;
      var10000 = var4 >> ((var26 | var27) & ~(var26 & var27));
      var27 = 1943281255;
      var26 = -1618661678;
      var10001 = (var26 | var27) & (~var26 | ~var27);
      var27 = -330223542;
      var26 = var10001;
      var27 = (var26 | var27) & (~var26 | ~var27);
      var26 = var10000;
      float var88 = (~var26 | var27) - ~var26;
      var27 = -1745012330;
      var26 = -1915302344;
      var10001 = (var26 | var27) & ~(var26 & var27);
      var27 = 1653180347;
      var26 = var10001;
      var10001 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
      float var8 = var88 / 255.0F;
      var10001 = (int)771416624332778756L;
      var27 = -1407274792;
      var26 = var10001;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -2026824236;
      var26 = var10001;
      var10000 = var4 >> var26 + var27 - 2 * (var26 & var27);
      var27 = 1698413315;
      var26 = 1478454299;
      var10001 = (var26 | var27) & (~var26 | ~var27);
      var27 = 1025824743;
      var26 = var10001;
      var27 = (var26 | var27) & ~(var26 & var27);
      var26 = var10000;
      float var90 = (~var26 | var27) - ~var26;
      int var10002 = (int)-8988845934676895706L;
      var27 = -2016344225;
      var26 = var10002;
      var10002 = var26 & ~var27 | ~var26 & var27;
      var27 = -720396425;
      var26 = var10002;
      var10002 = (var26 | var27) & (~var26 | ~var27);
      float var9 = var90 / 255.0F;
      var10001 = (int)-7872302571201562968L;
      var27 = -2107310911;
      var26 = var10001;
      var10001 = (var26 | var27) & (~var26 | ~var27);
      var27 = -851047786;
      var26 = var10001;
      var27 = (var26 | var27) & ~(var26 & var27);
      var26 = var4;
      float var91 = (~var26 | var27) - ~var26;
      String var108 = "byx";
      float var10 = var91 / 255.0F;
      var27 = 1377165996;
      var26 = 1171481843;
      var10001 = var26 + var27 - 2 * (var26 & var27);
      var27 = 398886471;
      var26 = var10001;
      var10000 = var4 >> ((var26 | var27) & (~var26 | ~var27));
      var27 = -1455928488;
      var26 = 1131642708;
      var10001 = (var26 | var27) - (var26 & var27);
      var27 = -364169997;
      var26 = var10001;
      var27 = (var26 | var27) & (~var26 | ~var27);
      var26 = var10000;
      float var93 = (~var26 | var27) - ~var26;
      String var111 = "byy";
      float var94 = var93 / 255.0F;
      String var112 = "byz";
      float var11 = var94 * 0.3F;
      BufferBuilder var12 = var5.begin(DrawMode.TRIANGLE_FAN, VertexFormats.POSITION_COLOR);
      double var13 = var1.x - var7.x;
      double var15 = var1.y - var7.y;
      double var17 = var1.z - var7.z;
      var12.vertex(var6, (float)var13, (float)var15, (float)var17).color(var8, var9, var10, var11);
      var10000 = (int)-9125385402528073811L;
      var27 = 132747409;
      var26 = var10000;
      var10000 = (var26 | var27) - (var26 & var27);
      var27 = 607053628;
      var26 = var10000;

      for (int var19 = (var26 | var27) & (~var26 | ~var27); var19 <= var3; var19++) {
         var27 = 1623490969;
         var26 = -1322540252;
         var10000 = var26 + var27 - 2 * (var26 & var27);
         var27 = -2083384148;
         var26 = var10000;
         var10000 = ((var26 | var27) - (var26 & var27)) * ((var26 | var27) - (var26 & var27));
         double var20 = (Math.PI * 2) * var19 / var3;
         double var22 = var13 + var2 * Math.cos(var20);
         double var24 = var17 + var2 * Math.sin(var20);
         var12.vertex(var6, (float)var22, (float)var15, (float)var24).color(var8, var9, var10, var11);
      }

      BufferRenderer.drawWithGlobalProgram(var12.end());
      RenderSystem.enableDepthTest();
      var27 = -1683140914;
      var26 = -659445985;
      var10000 = (var26 | var27) - (var26 & var27);
      var27 = 1125968336;
      var26 = var10000;
      RenderSystem.depthMask(pulse.Bool.from(var26 + var27 - 2 * (var26 & var27)));
      RenderSystem.disableBlend();
      var0.pop();
   }

   public static void a(MatrixStack var0, Vec3d var1, float var2, float var3, int var4, int var5) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      int var24 = 1313179031;
      int var23 = -1335521879;
      int var10000 = var23 + var24 - 2 * (var23 & var24);
      var24 = -31455170;
      var23 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var23 | var24) - (var23 & var24)));
      var10000 = (int)-3017033982167739803L;
      var24 = -1691522581;
      var23 = var10000;
      var10000 = (var23 | var24) & (~var23 | ~var24);
      var24 = -666209932;
      var23 = var10000;
      var10000 = (var23 | var24) & (~var23 | ~var24);
      int var10001 = (int)-5542248346668852854L;
      var24 = 2041965786;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = -348793667;
      var23 = var10001;
      var24 = var23 + var24 - 2 * (var23 & var24);
      var23 = var10000;
      var10000 = 2 * (var23 | var24) - (var23 ^ var24);
      RenderSystem.lineWidth(1.5F);
      a(var0, var1, var2, var4, var5, 0.0F);
      a(var0, var1, var2, var4, var5, var3);
      Tessellator var6 = Tessellator.getInstance();
      Matrix4f var7 = var0.peek().getPositionMatrix();
      Vec3d var8 = c.gameRenderer.getCamera().getPos();
      var10001 = (int)-4962572646134637137L;
      var24 = 1196365160;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = -665057065;
      var23 = var10001;
      var10000 = var5 >> ((var23 | var24) & ~(var23 & var24));
      var24 = 746819173;
      var23 = -1077679340;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var24 = -1824496242;
      var23 = var10001;
      var24 = (var23 | var24) & ~(var23 & var24);
      var23 = var10000;
      float var134 = (~var23 | var24) - ~var23;
      var24 = -841079584;
      var23 = -1936674679;
      int var10002 = var23 & ~var24 | ~var23 & var24;
      var24 = 1095668835;
      var23 = var10002;
      var10002 = var23 & ~var24 | ~var23 & var24;
      float var9 = var134 / 255.0F;
      var10001 = (int)4389726895876496110L;
      var24 = 625859590;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = -2063628576;
      var23 = var10001;
      var10000 = var5 >> (var23 & ~var24 | ~var23 & var24);
      var10001 = (int)7831790417087499848L;
      var24 = 1885178727;
      var23 = var10001;
      var10001 = var23 + var24 - 2 * (var23 & var24);
      var24 = -1248688688;
      var23 = var10001;
      var24 = var23 + var24 - 2 * (var23 & var24);
      var23 = var10000;
      float var136 = (~var23 | var24) - ~var23;
      var24 = 151194915;
      var23 = -1991691844;
      var10002 = (var23 | var24) & ~(var23 & var24);
      var24 = -2142618479;
      var23 = var10002;
      var10002 = var23 & ~var24 | ~var23 & var24;
      var10002 = (int)394696733754976619L;
      var24 = -491293932;
      var23 = var10002;
      var10002 = (var23 | var24) & ~(var23 & var24);
      var24 = 1942985337;
      var23 = var10002;
      var10002 = (var23 | var24) & ~(var23 & var24);
      float var10 = var136 / 255.0F;
      var24 = -483838482;
      var23 = 1450059285;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var24 = -1253633276;
      var23 = var10001;
      var24 = (var23 | var24) & (~var23 | ~var24);
      var23 = var5;
      float var137 = (~var23 | var24) - ~var23;
      var24 = -306591131;
      var23 = 2032490486;
      var10001 = var23 + var24 - 2 * (var23 & var24);
      var24 = -1835851188;
      var23 = var10001;
      var10001 = ((var23 | var24) & (~var23 | ~var24)) * ((var23 | var24) & (~var23 | ~var24));
      float var11 = var137 / 255.0F;
      var10001 = (int)6700854944612786052L;
      var24 = -1976659188;
      var23 = var10001;
      var10001 = var23 & ~var24 | ~var23 & var24;
      var24 = 1128139920;
      var23 = var10001;
      var10000 = var5 >> (var23 & ~var24 | ~var23 & var24);
      var10001 = (int)-7906387716347072070L;
      var24 = -776118569;
      var23 = var10001;
      var10001 = (var23 | var24) - (var23 & var24);
      var24 = -685527150;
      var23 = var10001;
      var24 = var23 + var24 - 2 * (var23 & var24);
      var23 = var10000;
      float var139 = (~var23 | var24) - ~var23;
      var10002 = (int)-769778469595795099L;
      var24 = -78588863;
      var23 = var10002;
      var10002 = (var23 | var24) & (~var23 | ~var24);
      var24 = -2001771218;
      var23 = var10002;
      var10002 = (var23 | var24) - (var23 & var24);
      var10002 = (int)661472410880953674L;
      var24 = 1214300956;
      var23 = var10002;
      var10002 = (var23 | var24) - (var23 & var24);
      var24 = 1730612823;
      var23 = var10002;
      var10002 = var23 & ~var24 | ~var23 & var24;
      float var12 = var139 / 255.0F;
      if (var12 == 0.0F) {
         var12 = 1.0F;
      }

      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder var13 = var6.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      var10000 = (int)6975183412706264345L;
      var24 = 1650014263;
      var23 = var10000;
      var10000 = var23 & ~var24 | ~var23 & var24;
      var24 = -137036498;
      var23 = var10000;
      int var14 = (var23 | var24) - (var23 & var24);

      while (true) {
         var10001 = (int)4155313364688264854L;
         var24 = -679417921;
         var23 = var10001;
         var10001 = (var23 | var24) & ~(var23 & var24);
         var24 = -1624393439;
         var23 = var10001;
         if (var14 >= (var23 | var24) - (var23 & var24)) {
            BufferRenderer.drawWithGlobalProgram(var13.end());
            RenderSystem.lineWidth(1.0F);
            RenderSystem.enableDepthTest();
            var10000 = (int)1397748217802993776L;
            var24 = 80081377;
            var23 = var10000;
            var10000 = var23 + var24 - 2 * (var23 & var24);
            var24 = 860930448;
            var23 = var10000;
            RenderSystem.depthMask(pulse.Bool.from((var23 | var24) - (var23 & var24)));
            RenderSystem.disableBlend();
            var0.pop();
            return;
         }

         var10001 = (int)4271523357520499773L;
         var24 = -334620893;
         var23 = var10001;
         var10001 = var23 & ~var24 | ~var23 & var24;
         var24 = 1522860830;
         var23 = var10001;
         var10001 = var23 + var24 - 2 * (var23 & var24);
         var10001 = (int)-3991690125238566881L;
         var24 = -978484305;
         var23 = var10001;
         var10001 = var23 & ~var24 | ~var23 & var24;
         var24 = 437584803;
         var23 = var10001;
         var10001 = (var23 | var24) & (~var23 | ~var24);
         var24 = 2076794738;
         var23 = 1109878994;
         var10001 = (var23 | var24) & ~(var23 & var24);
         var24 = 971913123;
         var23 = var10001;
         var10001 = (var23 | var24) & (~var23 | ~var24);
         var10001 = (int)-7907946994272430814L;
         var24 = 1494564435;
         var23 = var10001;
         var10001 = (var23 | var24) & ~(var23 & var24);
         var24 = 248720241;
         var23 = var10001;
         var10001 = var23 + var24 - 2 * (var23 & var24);
         double var142 = (Math.PI * 2) * var14;
         var24 = -833430383;
         var23 = -219500528;
         var10001 = var23 + var24 - 2 * (var23 & var24);
         var24 = 1637349389;
         var23 = var10001;
         var10001 = var23 & ~var24 | ~var23 & var24;
         double var15 = var142 / 8.0;
         double var17 = var1.x + var2 * Math.cos(var15) - var8.x;
         double var19 = var1.z + var2 * Math.sin(var15) - var8.z;
         double var21 = var1.y - var8.y;
         var13.vertex(var7, (float)var17, (float)var21, (float)var19).color(var9, var10, var11, var12);
         var13.vertex(var7, (float)var17, (float)(var21 + var3), (float)var19).color(var9, var10, var11, var12);
         var14++;
      }
   }

   public static void b(MatrixStack var0, Box var1, int var2) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      int var10000 = (int)-7460178059164666737L;
      int var25 = 144220000;
      int var24 = var10000;
      var10000 = var24 + var25 - 2 * (var24 & var25);
      var25 = -1093981201;
      var24 = var10000;
      RenderSystem.depthMask(pulse.Bool.from(var24 & (var25 ^ -1) | (var24 ^ -1) & var25));
      RenderSystem.disableCull();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Tessellator var3 = Tessellator.getInstance();
      Matrix4f var4 = var0.peek().getPositionMatrix();
      Vec3d var5 = c.gameRenderer.getCamera().getPos();
      double var6 = var1.minX - var5.x;
      double var8 = var1.minY - var5.y;
      double var10 = var1.minZ - var5.z;
      double var12 = var1.maxX - var5.x;
      double var14 = var1.maxY - var5.y;
      double var16 = var1.maxZ - var5.z;
      var25 = 1527673682;
      var24 = 25320918;
      int var10001 = (var24 | var25) & ~(var24 & var25);
      var25 = 1519136404;
      var24 = var10001;
      var10000 = var2 >> ((var24 | var25) & (~var24 | ~var25));
      var10001 = (int)-1900678254136053944L;
      var25 = 1881886926;
      var24 = var10001;
      var10001 = (var24 | var25) & ~(var24 & var25);
      var25 = -977109127;
      var24 = var10001;
      var25 = var24 & ~var25 | ~var24 & var25;
      var24 = var10000;
      float var125 = (~var24 | var25) - ~var24;
      String var141 = "bza";
      float var18 = var125 / 255.0F;
      var25 = 121247440;
      var24 = 933798962;
      var10001 = (var24 | var25) - (var24 & var25);
      var25 = 814920426;
      var24 = var10001;
      var10000 = var2 >> ((var24 | var25) & ~(var24 & var25));
      var25 = 1924731088;
      var24 = -1186296549;
      var10001 = (var24 | var25) & ~(var24 & var25);
      var25 = -873226956;
      var24 = var10001;
      var25 = (var24 | var25) - (var24 & var25);
      var24 = var10000;
      float var127 = (~var24 | var25) - ~var24;
      var25 = -924421947;
      var24 = -288474470;
      var10001 = (var24 | var25) & (~var24 | ~var25);
      var25 = -1151786140;
      var24 = var10001;
      var10001 = (var24 | var25) & (~var24 | ~var25);
      float var19 = var127 / 255.0F;
      var25 = -953616177;
      var24 = -87087852;
      var10001 = var24 + var25 - 2 * (var24 & var25);
      var25 = 1038605604;
      var24 = var10001;
      var25 = (var24 | var25) - (var24 & var25);
      var24 = var2;
      float var128 = (~var24 | var25) - ~var24;
      String var147 = "bzb";
      float var20 = var128 / 255.0F;
      var10001 = (int)6154273519266192208L;
      var25 = -862709363;
      var24 = var10001;
      var10001 = var24 + var25 - 2 * (var24 & var25);
      var25 = 2061517509;
      var24 = var10001;
      var10000 = var2 >> ((var24 | var25) & ~(var24 & var25));
      var25 = -838967170;
      var24 = -2071207105;
      var10001 = var24 & ~var25 | ~var24 & var25;
      var25 = 1232438206;
      var24 = var10001;
      var25 = var24 + var25 - 2 * (var24 & var25);
      var24 = var10000;
      float var130 = (~var24 | var25) - ~var24;
      var25 = -1109466773;
      var24 = 358517577;
      var10001 = var24 & ~var25 | ~var24 & var25;
      var25 = 1251873183;
      var24 = var10001;
      var10001 = (var24 | var25) & ~(var24 & var25);
      int var10002 = (int)8952416443457210572L;
      var25 = 1796173796;
      var24 = var10002;
      var10002 = var24 & ~var25 | ~var24 & var25;
      var25 = -1176299566;
      var24 = var10002;
      var25 = (var24 | var25) & ~(var24 & var25);
      var24 = var10001;
      var10001 = (var24 ^ var25) + 2 * (var24 & var25);
      float var21 = var130 / 255.0F;
      if (var21 != 0.0F) {
         if (b) {
            throw new RuntimeException();
         }
      } else {
         var21 = 1.0F;
      }

      var10002 = (int)-1805251248858052722L;
      var25 = -525346572;
      var24 = var10002;
      var10002 = var24 + var25 - 2 * (var24 & var25);
      var25 = 634625909;
      var24 = var10002;
      var10002 = (var24 | var25) & (~var24 | ~var25);
      var25 = -218730761;
      var24 = 1067129192;
      var10002 = (var24 | var25) & ~(var24 & var25);
      var25 = -848463970;
      var24 = var10002;
      var10002 = var24 & ~var25 | ~var24 & var25;
      float var22 = var21 * 0.11F;
      BufferBuilder var23 = var3.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var22);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var22);
      BufferRenderer.drawWithGlobalProgram(var23.end());
      RenderSystem.enableCull();
      var25 = -229673664;
      var24 = 667432525;
      var10000 = (var24 | var25) - (var24 & var25);
      var25 = -712555764;
      var24 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var24 | var25) & (var24 & var25 ^ -1)));
      var10000 = (int)8057179180393463638L;
      var25 = 1998304419;
      var24 = var10000;
      var10000 = (var24 | var25) & (~var24 | ~var25);
      var25 = -333585929;
      var24 = var10000;
      GL11.glEnable(var24 + var25 - 2 * (var24 & var25));
      var10000 = (int)-6447656520214858971L;
      var25 = 1331589210;
      var24 = var10000;
      var10000 = var24 & ~var25 | ~var24 & var25;
      var25 = -753849729;
      var24 = var10000;
      var10000 = (var24 | var25) - (var24 & var25);
      var10001 = (int)-7726933652879307056L;
      var25 = 860661096;
      var24 = var10001;
      var10001 = (var24 | var25) & (~var24 | ~var25);
      var25 = 1107495497;
      var24 = var10001;
      var25 = var24 & ~var25 | ~var24 & var25;
      var24 = var10000;
      var10000 = (var24 ^ var25) + 2 * (var24 & var25);
      var25 = -1992419859;
      var24 = -791769571;
      var10001 = var24 & ~var25 | ~var24 & var25;
      var25 = -1132125929;
      var24 = var10001;
      var10001 = var24 & ~var25 | ~var24 & var25;
      GL11.glPolygonOffset(-1.0F, -1.0F);
      var25 = -1767309101;
      var24 = 1631992434;
      var10001 = var24 & ~var25 | ~var24 & var25;
      var25 = -135316818;
      var24 = var10001;
      var10001 = (var24 | var25) & ~(var24 & var25);
      var25 = -1320751389;
      var24 = -395745025;
      var10001 = var24 & ~var25 | ~var24 & var25;
      var25 = 1496286747;
      var24 = var10001;
      var10001 = var24 + var25 - 2 * (var24 & var25);
      RenderSystem.lineWidth(1.5F);
      var23 = var3.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var23.end());
      var23 = var3.begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var23.end());
      var23 = var3.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);
      var23.vertex(var4, (float)var6, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var8, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var14, (float)var10).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var12, (float)var14, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var8, (float)var16).color(var18, var19, var20, var21);
      var23.vertex(var4, (float)var6, (float)var14, (float)var16).color(var18, var19, var20, var21);
      BufferRenderer.drawWithGlobalProgram(var23.end());
      GL11.glPolygonOffset(0.0F, 0.0F);
      var25 = 841904562;
      var24 = -165745679;
      var10000 = (var24 | var25) & (~var24 | ~var25);
      var25 = -1003442111;
      var24 = var10000;
      GL11.glDisable(var24 & ~var25 | ~var24 & var25);
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableBlend();
      var0.pop();
   }

   public static void a(MatrixStack var0, Iterable<BlockPos> var1, int var2) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      RenderSystem.enableDepthTest();
      int var23 = -1558925908;
      int var22 = 1374580484;
      int var10000 = var22 & ~var23 | ~var22 & var23;
      var23 = -218447191;
      var22 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var22 | var23) - (var22 & var23)));
      var10000 = (int)848781267462177294L;
      var23 = 1454785182;
      var22 = var10000;
      var10000 = (var22 | var23) & (~var22 | ~var23);
      var23 = -2053068142;
      var22 = var10000;
      GL11.glEnable((var22 | var23) & (~var22 | ~var23));
      var10000 = (int)-8849120755611503965L;
      var23 = 1477516376;
      var22 = var10000;
      var10000 = (var22 | var23) - (var22 & var23);
      var23 = -219673125;
      var22 = var10000;
      var10000 = (var22 & ~var23 | ~var22 & var23) * (var22 & ~var23 | ~var22 & var23);
      String var10001 = "bzc";
      GL11.glPolygonOffset(-1.0F, -1.0F);
      var23 = 1357086070;
      var22 = -803213960;
      var10000 = var22 + var23 - 2 * (var22 & var23);
      var23 = 971800190;
      var22 = var10000;
      var10000 = var22 + var23 - 2 * (var22 & var23);
      RenderSystem.lineWidth(1.5F);
      Tessellator var3 = Tessellator.getInstance();
      Matrix4f var4 = var0.peek().getPositionMatrix();
      Vec3d var5 = c.gameRenderer.getCamera().getPos();
      int var163 = (int)4226204649940676055L;
      var23 = 1558281998;
      var22 = var163;
      int var164 = (var22 | var23) - (var22 & var23);
      var23 = -2026892599;
      var22 = var164;
      var10000 = var2 >> (var22 | var23) - (var22 & var23);
      int var165 = (int)7652704890158560509L;
      var23 = -1150691037;
      var22 = var165;
      int var166 = var22 & ~var23 | ~var22 & var23;
      var23 = -6132447;
      var22 = var166;
      var23 = (var22 | var23) & (~var22 | ~var23);
      var22 = var10000;
      float var144 = (~var22 | var23) - ~var22;
      int var167 = (int)-6631119322085300739L;
      var23 = -2104474975;
      var22 = var167;
      int var168 = (var22 | var23) & ~(var22 & var23);
      var23 = -1510954768;
      var22 = var168;
      int var169 = (var22 | var23) & ~(var22 & var23);
      var23 = -39438294;
      var22 = 548285755;
      int var10002 = (var22 | var23) & (~var22 | ~var23);
      var23 = 1439272150;
      var22 = var10002;
      var23 = (var22 | var23) & (~var22 | ~var23);
      var22 = var169;
      int var170 = var22 - ~var23 - 1;
      float var6 = var144 / 255.0F;
      var23 = 227927846;
      var22 = 341393113;
      int var171 = (var22 | var23) & ~(var22 & var23);
      var23 = 432855543;
      var22 = var171;
      var10000 = var2 >> (var22 | var23) - (var22 & var23);
      int var172 = (int)6214262903509553911L;
      var23 = -90110142;
      var22 = var172;
      int var173 = (var22 | var23) & ~(var22 & var23);
      var23 = 1379013962;
      var22 = var173;
      var23 = var22 & ~var23 | ~var22 & var23;
      var22 = var10000;
      float var146 = (~var22 | var23) - ~var22;
      var10001 = "bzd";
      float var7 = var146 / 255.0F;
      var23 = 1098695501;
      var22 = 1299665567;
      int var175 = (var22 | var23) & ~(var22 & var23);
      var23 = 202084653;
      var22 = var175;
      var23 = var22 + var23 - 2 * (var22 & var23);
      var22 = var2;
      float var147 = (~var22 | var23) - ~var22;
      int var176 = (int)6118901195775109356L;
      var23 = 1449893204;
      var22 = var176;
      int var177 = var22 & ~var23 | ~var22 & var23;
      var23 = 2007152188;
      var22 = var177;
      int var178 = (var22 | var23) & (~var22 | ~var23);
      var23 = 2043316476;
      var22 = 1959571350;
      var10002 = (var22 | var23) & ~(var22 & var23);
      var23 = 1875520977;
      var22 = var10002;
      var23 = (var22 | var23) & ~(var22 & var23);
      var22 = var178;
      int var179 = (var22 & ~var23) + (var23 & ~var22) + 2 * (var22 & var23);
      float var8 = var147 / 255.0F;
      int var180 = (int)8563232756459771792L;
      var23 = 789609432;
      var22 = var180;
      int var181 = (var22 | var23) & (~var22 | ~var23);
      var23 = 1591110736;
      var22 = var181;
      var10000 = var2 >> (var22 | var23) - (var22 & var23);
      var23 = -1585632029;
      var22 = -323831539;
      int var182 = var22 & ~var23 | ~var22 & var23;
      var23 = 1305449745;
      var22 = var182;
      var23 = (var22 | var23) - (var22 & var23);
      var22 = var10000;
      float var149 = (~var22 | var23) - ~var22;
      int var183 = (int)2045862530882853184L;
      var23 = 1780578063;
      var22 = var183;
      int var184 = var22 + var23 - 2 * (var22 & var23);
      var23 = -804029427;
      var22 = var184;
      int var185 = ((var22 | var23) & ~(var22 & var23)) * ((var22 | var23) & ~(var22 & var23));
      float var9 = var149 / 255.0F;
      if (var9 != 0.0F) {
         if (a != a) {
            var23 = -418341328;
            var22 = 1537869029;
            var10000 = (var22 | var23) & (~var22 | ~var23);
            var23 = -1128621355;
            var22 = var10000;
            var10000 = var22 + var23 - 2 * (var22 & var23);
            var23 = 222437685;
            var22 = -682313495;
            int var186 = (var22 | var23) - (var22 & var23);
            var23 = -636053028;
            var22 = var186;
            var10000 /= var22 + var23 - 2 * (var22 & var23);
         }
      } else {
         var9 = 1.0F;
      }

      HashSet<BlockPos> var10 = new HashSet<>();

      for (BlockPos var12 : var1) {
         var10.add(var12);
      }

      BufferBuilder var24 = var3.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (BlockPos var13 : var10) {
         float var14 = var13.getX() - (float)var5.x;
         float var15 = var13.getY() - (float)var5.y;
         float var16 = var13.getZ() - (float)var5.z;
         float var17 = var14 + 1.0F;
         float var18 = var15 + 1.0F;
         float var19 = var16 + 1.0F;
         if (!var10.contains(var13.down())) {
            if (!var10.contains(var13.west())) {
               var24.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var14, var15, var19).color(var6, var7, var8, var9);
            }

            if (!var10.contains(var13.east())) {
               var24.vertex(var4, var17, var15, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var15, var19).color(var6, var7, var8, var9);
            }

            if (!var10.contains(var13.north())) {
               var24.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var15, var16).color(var6, var7, var8, var9);
            }

            if (!var10.contains(var13.south())) {
               var24.vertex(var4, var14, var15, var19).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var15, var19).color(var6, var7, var8, var9);
            }
         }

         if (!var10.contains(var13.up())) {
            if (!var10.contains(var13.west())) {
               var24.vertex(var4, var14, var18, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var14, var18, var19).color(var6, var7, var8, var9);
            }

            if (!var10.contains(var13.east())) {
               var24.vertex(var4, var17, var18, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var18, var19).color(var6, var7, var8, var9);
            }

            if (var10.contains(var13.north())) {
               if (b) {
                  var10000 = (int)-220057853435246004L;
                  var23 = -801493278;
                  var22 = var10000;
                  var10000 = (var22 | var23) & ~(var22 & var23);
                  var23 = -2016467794;
                  var22 = var10000;
                  var10000 = (var22 | var23) & (~var22 | ~var23);
                  var23 = 2076801882;
                  var22 = 1444425421;
                  int var187 = var22 & ~var23 | ~var22 & var23;
                  var23 = 768693655;
                  var22 = var187;
                  var10000 /= (var22 | var23) & (~var22 | ~var23);
               }
            } else {
               var24.vertex(var4, var14, var18, var16).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var18, var16).color(var6, var7, var8, var9);
            }

            if (!var10.contains(var13.south())) {
               var24.vertex(var4, var14, var18, var19).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var18, var19).color(var6, var7, var8, var9);
            }
         }

         if (!var10.contains(var13.west()) && !var10.contains(var13.north())) {
            var24.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var14, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.east()) && !var10.contains(var13.north())) {
            var24.vertex(var4, var17, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var17, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.east()) && !var10.contains(var13.south())) {
            var24.vertex(var4, var17, var15, var19).color(var6, var7, var8, var9);
            var24.vertex(var4, var17, var18, var19).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.west()) && !var10.contains(var13.south())) {
            var24.vertex(var4, var14, var15, var19).color(var6, var7, var8, var9);
            var24.vertex(var4, var14, var18, var19).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.west()) && var10.contains(var13.north()) && !var10.contains(var13.west().north())) {
            var24.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var14, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.north()) && var10.contains(var13.west()) && !var10.contains(var13.north().west())) {
            var24.vertex(var4, var14, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var14, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.east()) && var10.contains(var13.north()) && !var10.contains(var13.east().north())) {
            var24.vertex(var4, var17, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var17, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.north()) && var10.contains(var13.east()) && !var10.contains(var13.north().east())) {
            var24.vertex(var4, var17, var15, var16).color(var6, var7, var8, var9);
            var24.vertex(var4, var17, var18, var16).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.east()) && var10.contains(var13.south())) {
            if (var10.contains(var13.east().south())) {
               if (a != a) {
                  var23 = 99908348;
                  var22 = 99400964;
                  var10000 = (var22 | var23) & ~(var22 & var23);
                  var23 = 1624056;
                  var22 = var10000;
                  var10000 = (var22 | var23) & ~(var22 & var23);
                  var23 = 807892382;
                  var22 = 1084651743;
                  int var188 = (var22 | var23) & ~(var22 & var23);
                  var23 = 1887505729;
                  var22 = var188;
                  var10000 /= var22 & ~var23 | ~var22 & var23;
               }
            } else {
               var24.vertex(var4, var17, var15, var19).color(var6, var7, var8, var9);
               var24.vertex(var4, var17, var18, var19).color(var6, var7, var8, var9);
            }
         }

         if (!var10.contains(var13.south()) && var10.contains(var13.east()) && !var10.contains(var13.south().east())) {
            var24.vertex(var4, var17, var15, var19).color(var6, var7, var8, var9);
            var24.vertex(var4, var17, var18, var19).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.west()) && var10.contains(var13.south()) && !var10.contains(var13.west().south())) {
            var24.vertex(var4, var14, var15, var19).color(var6, var7, var8, var9);
            var24.vertex(var4, var14, var18, var19).color(var6, var7, var8, var9);
         }

         if (!var10.contains(var13.south())) {
            if (!var10.contains(var13.west())) {
               if (b) {
                  var23 = 1906988231;
                  var22 = 2021082349;
                  int var189 = var22 & ~var23 | ~var22 & var23;
                  var23 = 165482543;
                  var22 = var189;
                  int var190 = (var22 | var23) & ~(var22 & var23);
                  var23 = 195181469;
                  var22 = -119420256;
                  var10000 = (var22 | var23) - (var22 & var23);
                  var23 = 1811025729;
                  var22 = var10000;
                  int var21 = (var22 | var23) & (~var22 | ~var23);
                  a = var21;
               }
            } else if (!var10.contains(var13.south().west())) {
               var24.vertex(var4, var14, var15, var19).color(var6, var7, var8, var9);
               var24.vertex(var4, var14, var18, var19).color(var6, var7, var8, var9);
            }
         }
      }

      BufferRenderer.drawWithGlobalProgram(var24.end());
      GL11.glPolygonOffset(0.0F, 0.0F);
      var10000 = (int)8625044167294686236L;
      var23 = -1769282161;
      var22 = var10000;
      var10000 = (var22 | var23) & (~var22 | ~var23);
      var23 = -1792189551;
      var22 = var10000;
      GL11.glDisable((var22 | var23) & (~var22 | ~var23));
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableBlend();
      var0.pop();
   }

   public static void b(MatrixStack var0, Iterable<BlockPos> var1, int var2) {
      var0.push();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      int var36 = 1701422633;
      int var35 = 529214968;
      int var10000 = var35 & ~var36 | ~var35 & var36;
      var36 = 2061667281;
      var35 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var35 | var36) & (var35 ^ -1 | var36 ^ -1)));
      RenderSystem.disableCull();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      Tessellator var3 = Tessellator.getInstance();
      Matrix4f var4 = var0.peek().getPositionMatrix();
      Vec3d var5 = c.gameRenderer.getCamera().getPos();
      var36 = 2116221444;
      var35 = -2007477222;
      int var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = -159732210;
      var35 = var10001;
      var10000 = var2 >> (var35 | var36) - (var35 & var36);
      var10001 = (int)-8103312569663919080L;
      var36 = -945116081;
      var35 = var10001;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = 1788068008;
      var35 = var10001;
      var36 = (var35 | var36) - (var35 & var36);
      var35 = var10000;
      float var434 = (~var35 | var36) - ~var35;
      var10001 = (int)-4772179908928421313L;
      var36 = -1448630314;
      var35 = var10001;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = -852569422;
      var35 = var10001;
      var10001 = ((var35 | var36) - (var35 & var36)) * ((var35 | var36) - (var35 & var36));
      float var6 = var434 / 255.0F;
      var36 = -161600107;
      var35 = -174149294;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = 62954703;
      var35 = var10001;
      var10000 = var2 >> ((var35 | var36) & (~var35 | ~var36));
      var36 = 1447506977;
      var35 = 422090924;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = 1332718706;
      var35 = var10001;
      var36 = (var35 | var36) & ~(var35 & var36);
      var35 = var10000;
      float var436 = (~var35 | var36) - ~var35;
      var36 = 1606351668;
      var35 = 171272177;
      var10001 = (var35 | var36) & ~(var35 & var36);
      var36 = -1006486232;
      var35 = var10001;
      var10001 = ((var35 | var36) & (~var35 | ~var36)) * ((var35 | var36) & (~var35 | ~var36));
      float var7 = var436 / 255.0F;
      var36 = -2106749180;
      var35 = -1664347765;
      var10001 = (var35 | var36) & ~(var35 & var36);
      var36 = 513908336;
      var35 = var10001;
      var36 = var35 & ~var36 | ~var35 & var36;
      var35 = var2;
      float var437 = (~var35 | var36) - ~var35;
      var10001 = (int)4559632407401122250L;
      var36 = 1929162805;
      var35 = var10001;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = 762571316;
      var35 = var10001;
      var10001 = (var35 & ~var36 | ~var35 & var36) * (var35 & ~var36 | ~var35 & var36);
      float var8 = var437 / 255.0F;
      var10001 = (int)2912288859268224496L;
      var36 = 1383474567;
      var35 = var10001;
      var10001 = var35 + var36 - 2 * (var35 & var36);
      var36 = -831213457;
      var35 = var10001;
      var10000 = var2 >> (var35 & ~var36 | ~var35 & var36);
      var36 = 638926318;
      var35 = -127532973;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = -562873022;
      var35 = var10001;
      var36 = (var35 | var36) - (var35 & var36);
      var35 = var10000;
      float var439 = (~var35 | var36) - ~var35;
      var36 = -1018972933;
      var35 = -2108926011;
      var10001 = (var35 | var36) & ~(var35 & var36);
      var36 = 375210097;
      var35 = var10001;
      var10001 = var35 + var36 - 2 * (var35 & var36);
      float var9 = var439 / 255.0F;
      if (var9 != 0.0F) {
         if (a != a) {
            var36 = -842576861;
            var35 = 665700165;
            var10000 = var35 & ~var36 | ~var35 & var36;
            var36 = -1689562404;
            var35 = var10000;
            var10000 = (var35 | var36) - (var35 & var36);
            var10000 = (int)-5963442063566245576L;
            var36 = -1943438444;
            var35 = var10000;
            var10000 = var35 & ~var36 | ~var35 & var36;
            var36 = -763285144;
            var35 = var10000;
            int var34 = var35 & ~var36 | ~var35 & var36;
         }
      } else {
         var9 = 1.0F;
      }

      String var553 = "bze";
      float var10 = var9 * 0.2F;
      HashSet<BlockPos> var11 = new HashSet<>();
      var36 = -418180834;
      var35 = -1155586392;
      var10000 = var35 + var36 - 2 * (var35 & var36);
      var36 = 1045430772;
      var35 = var10000;
      var10000 = var35 + var36 - 2 * (var35 & var36);
      var10000 = (int)-6349387560065273462L;
      var36 = -1367603432;
      var35 = var10000;
      var10000 = (var35 | var36) - (var35 & var36);
      var36 = 1149602157;
      var35 = var10000;
      int var12 = (var35 | var36) - (var35 & var36);
      var10001 = (int)-2513313685142553733L;
      var36 = -1218780059;
      var35 = var10001;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = 1286201114;
      var35 = var10001;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = -520223537;
      var35 = -1833584850;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = 1917563880;
      var35 = var10001;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = 1692725183;
      var35 = -1269053644;
      var10000 = var35 & ~var36 | ~var35 & var36;
      var36 = -1354705036;
      var35 = var10000;
      int var13 = (var35 | var36) & (~var35 | ~var36);
      var10001 = (int)5155924336984101038L;
      var36 = -358258511;
      var35 = var10001;
      var10001 = (var35 | var36) & ~(var35 & var36);
      var36 = -400558050;
      var35 = var10001;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var36 = -1109154024;
      var35 = -1133253802;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = 26233923;
      var35 = var10001;
      var10001 = var35 + var36 - 2 * (var35 & var36);
      var36 = 2043324050;
      var35 = 492602950;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = 1687560403;
      var35 = var10001;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = 1195635433;
      var35 = 1897388386;
      var10000 = (var35 | var36) & ~(var35 & var36);
      var36 = 1235997812;
      var35 = var10000;
      int var14 = var35 + var36 - 2 * (var35 & var36);
      String var450 = "bzf";
      var36 = 553650586;
      var35 = 716031092;
      var10000 = (var35 | var36) & (~var35 | ~var36);
      var36 = -1951543826;
      var35 = var10000;
      int var15 = (var35 | var36) & (~var35 | ~var36);
      String var452 = "bzg";
      var36 = 1385017393;
      var35 = 1395396665;
      var10000 = var35 & ~var36 | ~var35 & var36;
      var36 = -2120114168;
      var35 = var10000;
      int var16 = var35 & ~var36 | ~var35 & var36;
      var10000 = (int)-4556383569745999286L;
      var36 = -2137260097;
      var35 = var10000;
      var10000 = (var35 | var36) - (var35 & var36);
      var36 = -75694377;
      var35 = var10000;
      var10000 = (var35 | var36) - (var35 & var36);
      var36 = -1619219369;
      var35 = 70489647;
      var10000 = (var35 | var36) & ~(var35 & var36);
      var36 = 458177144;
      var35 = var10000;
      int var17 = var35 + var36 - 2 * (var35 & var36);

      for (BlockPos var19 : var1) {
         var11.add(var19);
         var12 = Math.min(var12, var19.getX());
         var13 = Math.min(var13, var19.getY());
         var14 = Math.min(var14, var19.getZ());
         var15 = Math.max(var15, var19.getX());
         var16 = Math.max(var16, var19.getY());
         var17 = Math.max(var17, var19.getZ());
      }

      BufferBuilder var37 = var3.begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);

      for (BlockPos var20 : var11) {
         float var458;
         if (var20.getX() != var12) {
            var458 = 0.0F;
         } else {
            var10000 = (int)-6016793441801007209L;
            var36 = -1570982006;
            var35 = var10000;
            var10000 = (var35 | var36) - (var35 & var36);
            var36 = 988751740;
            var35 = var10000;
            var10000 = (var35 | var36) - (var35 & var36);
            var36 = -563611239;
            var35 = -523944467;
            var10001 = var35 + var36 - 2 * (var35 & var36);
            var36 = -1665491801;
            var35 = var10001;
            var36 = var35 & ~var36 | ~var35 & var36;
            var35 = var10000;
            var10000 = var35 - ~var36 - 1;
            var458 = 0.01F;
         }

         float var21 = var458;
         float var463;
         if (var20.getY() != var13) {
            var463 = 0.0F;
         } else {
            String var464 = "bzh";
            var463 = 0.01F;
         }

         float var22 = var463;
         float var465;
         if (var20.getZ() != var14) {
            var465 = 0.0F;
         } else {
            var10001 = (int)-4017632865901673430L;
            var36 = 328561937;
            var35 = var10001;
            var10001 = (var35 | var36) & ~(var35 & var36);
            var36 = -831884996;
            var35 = var10001;
            var10001 = var35 & ~var36 | ~var35 & var36;
            var10001 = (int)-3817027435509016130L;
            var36 = -1999701838;
            var35 = var10001;
            var10001 = (var35 | var36) & ~(var35 & var36);
            var36 = -799121140;
            var35 = var10001;
            var10001 = (var35 | var36) & (~var35 | ~var36);
            var465 = 0.01F;
         }

         float var23 = var465;
         float var473;
         if (var20.getX() != var15) {
            var10001 = (int)2924813789124751721L;
            var36 = -697632185;
            var35 = var10001;
            var10001 = (var35 | var36) - (var35 & var36);
            var36 = -1063580886;
            var35 = var10001;
            var10001 = (var35 | var36) - (var35 & var36);
            var10001 = (int)8670274811282692587L;
            var36 = 649116517;
            var35 = var10001;
            var10001 = var35 + var36 - 2 * (var35 & var36);
            var36 = -785046904;
            var35 = var10001;
            var10001 = var35 & ~var36 | ~var35 & var36;
            var36 = 1196567665;
            var35 = 124697587;
            var10000 = var35 & ~var36 | ~var35 & var36;
            var36 = 873977884;
            var35 = var10000;
            int var54 = var35 & ~var36 | ~var35 & var36;
            String var467 = "bzi";
            var36 = -1716385244;
            var35 = 496759448;
            var10000 = var35 + var36 - 2 * (var35 & var36);
            var36 = -1242771999;
            var35 = var10000;
            if (((var35 | var36) & (~var35 | ~var36)) >= var54) {
               var10000 = (int)-6848812742519521428L;
               var36 = 1473939715;
               var35 = var10000;
               var10000 = var35 + var36 - 2 * (var35 & var36);
               var36 = -1288767889;
               var35 = var10000;
               var10000 = (var35 | var36) & ~(var35 & var36);
               var36 = 1171290011;
               var35 = -757523051;
               var10001 = (var35 | var36) - (var35 & var36);
               var36 = -1760990706;
               var35 = var10001;
               var10000 /= var35 & ~var36 | ~var35 & var36;
            }

            var473 = 0.0F;
         } else {
            var36 = 208196107;
            var35 = 1297375001;
            var10000 = (var35 | var36) & (~var35 | ~var36);
            var36 = 1539343787;
            var35 = var10000;
            var10000 = (var35 + var36 - 2 * (var35 & var36)) * (var35 + var36 - 2 * (var35 & var36));
            var473 = 0.01F;
            if (b) {
               var10001 = (int)3943708107021282514L;
               var36 = -1070123023;
               var35 = var10001;
               var10001 = var35 & ~var36 | ~var35 & var36;
               var36 = 1590327096;
               var35 = var10001;
               var10001 = ((var35 | var36) & (~var35 | ~var36)) * ((var35 | var36) & (~var35 | ~var36));
               var10001 = (int)-6332606641520692079L;
               var36 = -1328528928;
               var35 = var10001;
               var10001 = var35 + var36 - 2 * (var35 & var36);
               var36 = -1008893231;
               var35 = var10001;
               int var55 = var35 & ~var36 | ~var35 & var36;
            }
         }

         float var24 = var473;
         float var476;
         if (var20.getY() != var16) {
            var476 = 0.0F;
         } else {
            var36 = -463497393;
            var35 = -2018178614;
            var10001 = (var35 | var36) - (var35 & var36);
            var36 = 1676320394;
            var35 = var10001;
            var10001 = var35 & ~var36 | ~var35 & var36;
            var476 = 0.01F;
            var36 = -1878645201;
            var35 = -239799342;
            int var10002 = (var35 | var36) - (var35 & var36);
            var36 = 1639110125;
            var35 = var10002;
            var10002 = (var35 | var36) & (~var35 | ~var36);
            var36 = 692088219;
            var35 = -2118434779;
            var10002 = (var35 | var36) - (var35 & var36);
            var36 = -1459933763;
            var35 = var10002;
            var10002 = (var35 | var36) & ~(var35 & var36);
            var10001 = (int)-6474545244810134766L;
            var36 = 1574104804;
            var35 = var10001;
            var10001 = (var35 | var36) & (~var35 | ~var36);
            var36 = 45717438;
            var35 = var10001;
            int var56 = var35 & ~var36 | ~var35 & var36;
            a = var56;
            var10001 = (int)5230356589523324761L;
            var36 = 656555583;
            var35 = var10001;
            var10001 = (var35 | var36) - (var35 & var36);
            var36 = 410281127;
            var35 = var10001;
            var10001 = ((var35 | var36) - (var35 & var36)) * ((var35 | var36) - (var35 & var36));
            var36 = 1917190;
            var35 = -1423364668;
            var10001 = var35 & ~var36 | ~var35 & var36;
            var36 = -1743127556;
            var35 = var10001;
            if (((var35 | var36) & ~(var35 & var36)) < a) {
               var36 = -1618935602;
               var35 = -1267832215;
               var10001 = var35 & ~var36 | ~var35 & var36;
               var36 = 1813905542;
               var35 = var10001;
               var10001 = ((var35 | var36) & ~(var35 & var36)) * ((var35 | var36) & ~(var35 & var36));
               var36 = -706363818;
               var35 = 646469128;
               var10001 = (var35 | var36) - (var35 & var36);
               var36 = 227899089;
               var35 = var10001;
               var56 = var35 & ~var36 | ~var35 & var36;
               a = var56;
            }
         }

         float var25 = var476;
         float var477;
         if (var20.getZ() != var17) {
            var477 = 0.0F;
         } else {
            var10000 = (int)5625473348277090125L;
            var36 = 1942507;
            var35 = var10000;
            var10000 = (var35 | var36) & ~(var35 & var36);
            var36 = -1729558232;
            var35 = var10000;
            var10000 = (var35 & ~var36 | ~var35 & var36) * (var35 & ~var36 | ~var35 & var36);
            var477 = 0.01F;
         }

         float var26 = var477;
         float var27 = var20.getX() - (float)var5.x + var21;
         float var28 = var20.getY() - (float)var5.y + var22;
         float var29 = var20.getZ() - (float)var5.z + var23;
         float var30 = var27 + 1.0F - var21 - var24;
         float var31 = var28 + 1.0F - var22 - var25;
         float var32 = var29 + 1.0F - var23 - var26;
         if (!var11.contains(var20.down())) {
            var37.vertex(var4, var27, var28, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var28, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var28, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var28, var32).color(var6, var7, var8, var10);
         }

         if (!var11.contains(var20.up())) {
            var37.vertex(var4, var27, var31, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var31, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var29).color(var6, var7, var8, var10);
         }

         if (!var11.contains(var20.north())) {
            var37.vertex(var4, var27, var28, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var31, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var28, var29).color(var6, var7, var8, var10);
         }

         if (!var11.contains(var20.south())) {
            var37.vertex(var4, var27, var28, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var28, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var31, var32).color(var6, var7, var8, var10);
         }

         if (var11.contains(var20.west())) {
            if (a != a) {
               var36 = -395771135;
               var35 = -308016997;
               var10000 = var35 & ~var36 | ~var35 & var36;
               var36 = 201836840;
               var35 = var10000;
               var10000 = ((var35 | var36) - (var35 & var36)) * ((var35 | var36) - (var35 & var36));
               var10000 = (int)6360988651503861313L;
               var36 = 46635430;
               var35 = var10000;
               var10000 = (var35 | var36) & (~var35 | ~var36);
               var36 = 1162525443;
               var35 = var10000;
               int var58 = var35 + var36 - 2 * (var35 & var36);
               a = var58;
            }
         } else {
            var37.vertex(var4, var27, var28, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var28, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var31, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var27, var31, var29).color(var6, var7, var8, var10);
         }

         if (!var11.contains(var20.east())) {
            var37.vertex(var4, var30, var28, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var29).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var31, var32).color(var6, var7, var8, var10);
            var37.vertex(var4, var30, var28, var32).color(var6, var7, var8, var10);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var37.end());
      RenderSystem.enableCull();
      var36 = -1175152844;
      var35 = -96636502;
      var10000 = (var35 | var36) & (~var35 | ~var36);
      var36 = 1137305247;
      var35 = var10000;
      RenderSystem.depthMask(pulse.Bool.from((var35 | var36) - (var35 & var36)));
      var36 = 695053278;
      var35 = -1437237750;
      var10000 = var35 + var36 - 2 * (var35 & var36);
      var36 = -2093416490;
      var35 = var10000;
      GL11.glEnable(var35 & ~var36 | ~var35 & var36);
      var36 = 338688780;
      var35 = -851496285;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = -653211201;
      var35 = var10001;
      var10001 = (var35 | var36) & (~var35 | ~var36);
      var10001 = (int)-4643895943009896104L;
      var36 = 1419715704;
      var35 = var10001;
      var10001 = (var35 | var36) & ~(var35 & var36);
      var36 = -744792785;
      var35 = var10001;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = 318419049;
      var35 = -1360501995;
      var10001 = var35 & ~var36 | ~var35 & var36;
      var36 = -1139616902;
      var35 = var10001;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = -996684267;
      var35 = 1740013846;
      var10001 = (var35 | var36) - (var35 & var36);
      var36 = -1825250057;
      var35 = var10001;
      var10001 = ((var35 | var36) & ~(var35 & var36)) * ((var35 | var36) & ~(var35 & var36));
      GL11.glPolygonOffset(-1.0F, -1.0F);
      var36 = 520253129;
      var35 = -1243981155;
      var10000 = var35 & ~var36 | ~var35 & var36;
      var36 = -1407852467;
      var35 = var10000;
      var10000 = var35 & ~var36 | ~var35 & var36;
      var10001 = (int)4652192094338601510L;
      var36 = -1779775858;
      var35 = var10001;
      var10001 = var35 + var36 - 2 * (var35 & var36);
      var36 = -2075964627;
      var35 = var10001;
      var36 = (var35 | var36) - (var35 & var36);
      var35 = var10000;
      var10000 = (var35 | var36) + (var35 & var36);
      RenderSystem.lineWidth(1.5F);
      var37 = var3.begin(DrawMode.DEBUG_LINES, VertexFormats.POSITION_COLOR);

      for (BlockPos var41 : var11) {
         float var490;
         if (var41.getX() != var12) {
            var490 = 0.0F;
         } else {
            String var491 = "bzj";
            var490 = 0.01F;
            if (a != a) {
               String var607 = "bzk";
               var36 = 663190407;
               var35 = -1798548299;
               var10001 = (var35 | var36) & ~(var35 & var36);
               var36 = -7687788;
               var35 = var10001;
               int var59 = var35 & ~var36 | ~var35 & var36;
            }
         }

         float var42 = var490;
         float var492;
         if (var41.getY() != var13) {
            var492 = 0.0F;
         } else {
            String var493 = "bzl";
            var492 = 0.01F;
         }

         float var43 = var492;
         float var494;
         if (var41.getZ() != var14) {
            var494 = 0.0F;
         } else {
            String var495 = "bzm";
            var494 = 0.01F;
         }

         float var44 = var494;
         float var496;
         if (var41.getX() != var15) {
            var496 = 0.0F;
         } else {
            var10000 = (int)6732005564550072960L;
            var36 = -473363721;
            var35 = var10000;
            var10000 = var35 & ~var36 | ~var35 & var36;
            var36 = -1959767891;
            var35 = var10000;
            var10000 = ((var35 | var36) - (var35 & var36)) * ((var35 | var36) - (var35 & var36));
            var496 = 0.01F;
         }

         float var45 = var496;
         float var500;
         if (var41.getY() != var16) {
            var500 = 0.0F;
         } else {
            String var501 = "bzn";
            var500 = 0.01F;
         }

         float var46 = var500;
         float var502;
         if (var41.getZ() != var17) {
            var502 = 0.0F;
         } else {
            var10000 = (int)-5304784507421655916L;
            var36 = 1803394188;
            var35 = var10000;
            var10000 = (var35 | var36) & (~var35 | ~var36);
            var36 = -1905233532;
            var35 = var10000;
            var10000 = var35 & ~var36 | ~var35 & var36;
            var502 = 0.01F;
            var10001 = (int)-2927069769144017351L;
            var36 = -106821632;
            var35 = var10001;
            var10001 = (var35 | var36) - (var35 & var36);
            var36 = -153533781;
            var35 = var10001;
            var10001 = (var35 | var36) & (~var35 | ~var36);
            var36 = -832500543;
            var35 = 430380666;
            var10001 = (var35 | var36) & ~(var35 & var36);
            var36 = -453118606;
            var35 = var10001;
            int var60 = (var35 | var36) & (~var35 | ~var36);
            a = var60;
            int var630 = (int)5663750193980072550L;
            var36 = -818152195;
            var35 = var630;
            var630 = (var35 | var36) & ~(var35 & var36);
            var36 = -411001206;
            var35 = var630;
            var630 = (var35 | var36) & (~var35 | ~var36);
            var36 = 1994309235;
            var35 = 1869044130;
            var630 = var35 & ~var36 | ~var35 & var36;
            var36 = 431613916;
            var35 = var630;
            var630 = (var35 | var36) & ~(var35 & var36);
            var630 = (int)5900816850439375087L;
            var36 = -1264130016;
            var35 = var630;
            var630 = (var35 | var36) & (~var35 | ~var36);
            var36 = -340598578;
            var35 = var630;
            var630 = var35 + var36 - 2 * (var35 & var36);
            var630 = (int)9055321207663382792L;
            var36 = -531732621;
            var35 = var630;
            var630 = (var35 | var36) & (~var35 | ~var36);
            var36 = -1516751243;
            var35 = var630;
            var630 = var35 + var36 - 2 * (var35 & var36);
            var36 = 1004050364;
            var35 = 283915222;
            var10001 = var35 + var36 - 2 * (var35 & var36);
            var36 = 1479091964;
            var35 = var10001;
            if ((var35 | var36) - (var35 & var36) <= a) {
               String var614 = "bzo";
               var10001 = (int)-5254933613300693615L;
               var36 = -1563595663;
               var35 = var10001;
               var10001 = var35 & ~var36 | ~var35 & var36;
               var36 = -2070057211;
               var35 = var10001;
               var60 = (var35 | var36) & (~var35 | ~var36);
            }
         }

         float var47 = var502;
         float var48 = var41.getX() - (float)var5.x + var42;
         float var49 = var41.getY() - (float)var5.y + var43;
         float var50 = var41.getZ() - (float)var5.z + var44;
         float var51 = var48 + 1.0F - var42 - var45;
         float var52 = var49 + 1.0F - var43 - var46;
         float var53 = var50 + 1.0F - var44 - var47;
         if (!var11.contains(var41.down())) {
            if (!var11.contains(var41.west())) {
               var37.vertex(var4, var48, var49, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var48, var49, var53).color(var6, var7, var8, var9);
            }

            if (!var11.contains(var41.east())) {
               var37.vertex(var4, var51, var49, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var49, var53).color(var6, var7, var8, var9);
            }

            if (!var11.contains(var41.north())) {
               var37.vertex(var4, var48, var49, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var49, var50).color(var6, var7, var8, var9);
            }

            if (!var11.contains(var41.south())) {
               var37.vertex(var4, var48, var49, var53).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var49, var53).color(var6, var7, var8, var9);
            }
         }

         if (!var11.contains(var41.up())) {
            if (!var11.contains(var41.west())) {
               var37.vertex(var4, var48, var52, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var48, var52, var53).color(var6, var7, var8, var9);
            }

            if (!var11.contains(var41.east())) {
               var37.vertex(var4, var51, var52, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var52, var53).color(var6, var7, var8, var9);
            }

            if (var11.contains(var41.north())) {
               var10000 = (int)8139334953259288684L;
               var36 = 118699646;
               var35 = var10000;
               var10000 = (var35 | var36) - (var35 & var36);
               var36 = 1897023839;
               var35 = var10000;
               var10000 = (var35 | var36) & ~(var35 & var36);
               var10001 = (int)2449232105608325126L;
               var36 = 14148530;
               var35 = var10001;
               var10001 = (var35 | var36) - (var35 & var36);
               var36 = -2114118560;
               var35 = var10001;
               var36 = (var35 | var36) & ~(var35 & var36);
               var35 = var10000;
               var10000 = var35 - ~var36 - 1;
               var36 = 1586967698;
               var35 = -1066384467;
               var10000 = (var35 | var36) & (~var35 | ~var36);
               var36 = -551887429;
               var35 = var10000;
               int var62 = (var35 | var36) - (var35 & var36);
               var10000 = (int)5918978330750443919L;
               var36 = 1771820244;
               var35 = var10000;
               var10000 = (var35 | var36) & ~(var35 & var36);
               var36 = -460489287;
               var35 = var10000;
               var10000 = ((var35 | var36) & ~(var35 & var36)) * ((var35 | var36) & ~(var35 & var36));
               var36 = 862255453;
               var35 = -564375469;
               var10000 = var35 + var36 - 2 * (var35 & var36);
               var36 = -850204840;
               var35 = var10000;
               if (((var35 | var36) & ~(var35 & var36)) >= var62) {
                  var36 = 1097876396;
                  var35 = -1564871979;
                  var10001 = (var35 | var36) - (var35 & var36);
                  var36 = -473321103;
                  var35 = var10001;
                  var10001 = var35 + var36 - 2 * (var35 & var36);
                  var10000 = (int)8487017094817811406L;
                  var36 = 394080076;
                  var35 = var10000;
                  var10000 = (var35 | var36) & (~var35 | ~var36);
                  var36 = -1590180634;
                  var35 = var10000;
                  var62 = var35 & ~var36 | ~var35 & var36;
               }
            } else {
               var37.vertex(var4, var48, var52, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var52, var50).color(var6, var7, var8, var9);
            }

            if (!var11.contains(var41.south())) {
               var37.vertex(var4, var48, var52, var53).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var52, var53).color(var6, var7, var8, var9);
            }
         }

         if (!var11.contains(var41.west()) && !var11.contains(var41.north())) {
            var37.vertex(var4, var48, var49, var50).color(var6, var7, var8, var9);
            var37.vertex(var4, var48, var52, var50).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.east()) && !var11.contains(var41.north())) {
            var37.vertex(var4, var51, var49, var50).color(var6, var7, var8, var9);
            var37.vertex(var4, var51, var52, var50).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.east()) && !var11.contains(var41.south())) {
            var37.vertex(var4, var51, var49, var53).color(var6, var7, var8, var9);
            var37.vertex(var4, var51, var52, var53).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.west()) && !var11.contains(var41.south())) {
            var37.vertex(var4, var48, var49, var53).color(var6, var7, var8, var9);
            var37.vertex(var4, var48, var52, var53).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.west()) && var11.contains(var41.north()) && !var11.contains(var41.west().north())) {
            var37.vertex(var4, var48, var49, var50).color(var6, var7, var8, var9);
            var37.vertex(var4, var48, var52, var50).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.north()) && var11.contains(var41.west()) && !var11.contains(var41.north().west())) {
            var37.vertex(var4, var48, var49, var50).color(var6, var7, var8, var9);
            var37.vertex(var4, var48, var52, var50).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.east())) {
            if (!var11.contains(var41.north())) {
               if (b) {
                  var10000 = (int)1629329327076798854L;
                  var36 = 1797080045;
                  var35 = var10000;
                  var10000 = (var35 | var36) - (var35 & var36);
                  var36 = -1142338794;
                  var35 = var10000;
                  var10000 = var35 & ~var36 | ~var35 & var36;
                  var10001 = (int)-3963689293971353762L;
                  var36 = -1542859429;
                  var35 = var10001;
                  var10001 = (var35 | var36) & (~var35 | ~var36);
                  var36 = 289524928;
                  var35 = var10001;
                  var36 = var35 & ~var36 | ~var35 & var36;
                  var35 = var10000;
                  var10000 = 2 * (var35 | var36) - (var35 ^ var36);
                  var10000 = (int)-3029858206044905060L;
                  var36 = 1666665427;
                  var35 = var10000;
                  var10000 = (var35 | var36) & ~(var35 & var36);
                  var36 = 247547578;
                  var35 = var10000;
                  int var64 = (var35 | var36) - (var35 & var36);
                  a = var64;
               }
            } else if (!var11.contains(var41.east().north())) {
               var37.vertex(var4, var51, var49, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var52, var50).color(var6, var7, var8, var9);
            }
         }

         if (!var11.contains(var41.north())) {
            if (!var11.contains(var41.east())) {
               if (b) {
                  var36 = -150660386;
                  var35 = -899157942;
                  var10001 = (var35 | var36) & ~(var35 & var36);
                  var36 = 1029892761;
                  var35 = var10001;
                  var10001 = (var35 | var36) & (~var35 | ~var36);
                  var10000 = (int)-7927684176897061816L;
                  var36 = -328149622;
                  var35 = var10000;
                  var10000 = (var35 | var36) & ~(var35 & var36);
                  var36 = 1259133950;
                  var35 = var10000;
                  int var65 = (var35 | var36) & (~var35 | ~var36);
               }
            } else if (!var11.contains(var41.north().east())) {
               var37.vertex(var4, var51, var49, var50).color(var6, var7, var8, var9);
               var37.vertex(var4, var51, var52, var50).color(var6, var7, var8, var9);
            }
         }

         if (!var11.contains(var41.east()) && var11.contains(var41.south()) && !var11.contains(var41.east().south())) {
            var37.vertex(var4, var51, var49, var53).color(var6, var7, var8, var9);
            var37.vertex(var4, var51, var52, var53).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.south()) && var11.contains(var41.east()) && !var11.contains(var41.south().east())) {
            var37.vertex(var4, var51, var49, var53).color(var6, var7, var8, var9);
            var37.vertex(var4, var51, var52, var53).color(var6, var7, var8, var9);
         }

         if (!var11.contains(var41.west())) {
            if (!var11.contains(var41.south())) {
               var36 = -1624995609;
               var35 = -993780122;
               var10000 = (var35 | var36) & ~(var35 & var36);
               var36 = -857062157;
               var35 = var10000;
               var10000 = var35 + var36 - 2 * (var35 & var36);
               var10000 = (int)-4816599689621004097L;
               var36 = -485974180;
               var35 = var10000;
               var10000 = var35 + var36 - 2 * (var35 & var36);
               var36 = -413512573;
               var35 = var10000;
               int var66 = var35 & ~var36 | ~var35 & var36;
               a = var66;
               String var529 = "bzp";
               var36 = 422327041;
               var35 = -772828808;
               var10000 = (var35 | var36) & (~var35 | ~var36);
               var36 = -585901024;
               var35 = var10000;
               if (((var35 | var36) & (~var35 | ~var36)) <= a) {
                  var36 = 1225191568;
                  var35 = -338839873;
                  var10000 = (var35 | var36) & (~var35 | ~var36);
                  var36 = -1563736529;
                  var35 = var10000;
                  var10000 = (var35 | var36) - (var35 & var36);
                  var10001 = (int)-4867073013326693451L;
                  var36 = 90684385;
                  var35 = var10001;
                  var10001 = var35 + var36 - 2 * (var35 & var36);
                  var36 = -1650327468;
                  var35 = var10001;
                  var10000 /= (var35 | var36) & (~var35 | ~var36);
               }
            } else if (!var11.contains(var41.west().south())) {
               var37.vertex(var4, var48, var49, var53).color(var6, var7, var8, var9);
               var37.vertex(var4, var48, var52, var53).color(var6, var7, var8, var9);
            }
         }

         if (!var11.contains(var41.south()) && var11.contains(var41.west()) && !var11.contains(var41.south().west())) {
            var37.vertex(var4, var48, var49, var53).color(var6, var7, var8, var9);
            var37.vertex(var4, var48, var52, var53).color(var6, var7, var8, var9);
         }
      }

      BufferRenderer.drawWithGlobalProgram(var37.end());
      GL11.glPolygonOffset(0.0F, 0.0F);
      var36 = -1655994626;
      var35 = -1413851651;
      var10000 = var35 + var36 - 2 * (var35 & var36);
      var36 = 921827585;
      var35 = var10000;
      GL11.glDisable(var35 + var36 - 2 * (var35 & var36));
      RenderSystem.lineWidth(1.0F);
      RenderSystem.disableBlend();
      var0.pop();
   }

   @Generated
   private WorldRenderUtils() {
      int var2 = -457299523;
      int var1 = -599529440;
      int var10002 = (var1 | var2) - (var1 & var2);
      var2 = 868626848;
      var1 = var10002;
      var10002 = (var1 | var2) & (~var1 | ~var2);
      String var10003 = "bzq";
      var2 = -1101576520;
      var1 = -1821205023;
      int var10004 = var1 + var2 - 2 * (var1 & var2);
      var2 = 687059218;
      var1 = var10004;
      var10004 = (var1 | var2) - (var1 & var2);
      var2 = 662868453;
      var1 = -180650657;
      int var10005 = var1 + var2 - 2 * (var1 & var2);
      var2 = 105977388;
      var1 = var10005;
      var2 = var1 & ~var2 | ~var1 & var2;
      var1 = var10004;
      var10004 = 2 * (var1 | var2) - (var1 ^ var2);
      var10004 = (int)-786231124547077241L;
      var2 = -1465553992;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      var2 = 1298672452;
      var1 = var10004;
      var10004 = (var1 | var2) & (~var1 | ~var2);
      String var45 = "bzr";
      var10005 = (int)497265956861912793L;
      var2 = 190652835;
      var1 = var10005;
      var10005 = var1 & ~var2 | ~var1 & var2;
      var2 = -2038157686;
      var1 = var10005;
      var10005 = (var1 | var2) & ~(var1 & var2);
      int var10006 = (int)9071020993619390888L;
      var2 = -1355698318;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      var2 = 1667845950;
      var1 = var10006;
      var10006 = ((var1 | var2) & (~var1 | ~var2)) * ((var1 | var2) & (~var1 | ~var2));
      var10006 = (int)5616159130181428007L;
      var2 = -1497054321;
      var1 = var10006;
      var10006 = (var1 | var2) & (~var1 | ~var2);
      var2 = -2146053370;
      var1 = var10006;
      var10006 = var1 + var2 - 2 * (var1 & var2);
      int var10007 = (int)1877739761034358156L;
      var2 = -807023106;
      var1 = var10007;
      var10007 = var1 & ~var2 | ~var1 & var2;
      var2 = 1074953696;
      var1 = var10007;
      var10007 = var1 + var2 - 2 * (var1 & var2);
      var10007 = (int)-6214725528559392309L;
      var2 = -1688964871;
      var1 = var10007;
      var10007 = (var1 | var2) & (~var1 | ~var2);
      var2 = -1767082703;
      var1 = var10007;
      throw new UnsupportedOperationException(
         b(
            "륝渙률渂뤩渘륺湑륨湑를清률渝률清륰湑륪渝륨渂륺湑륨渟륭湑륪渐륧渟륦清뤩渓륬湑률渟륺清륨渟륽渘륨清륬渕",
            "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ組蹏⑴謳㑲`ꟓ꒡ꁸ꤉絥",
            var10004,
            var10005,
            var10006,
            var1 + var2 - 2 * (var1 & var2)
         )
      );
   }

   static {
      int var10000 = (int)1838922832680948947L;
      int var1 = -1195327212;
      int var0 = var10000;
      var10000 = (var0 | var1) & (~var0 | ~var1);
      var1 = -374080594;
      var0 = var10000;
      var10000 = ((var0 | var1) & (~var0 | ~var1)) * ((var0 | var1) & (~var0 | ~var1));
      var1 = 1218595670;
      var0 = -1175447926;
      int var10001 = var0 & ~var1 | ~var0 & var1;
      var1 = 1607847535;
      var0 = var10001;
      var10001 = (var0 | var1) & ~(var0 & var1);
      var1 = 841031355;
      var0 = 97185681;
      int var10002 = (var0 | var1) - (var0 & var1);
      var1 = 467286074;
      var0 = var10002;
      var1 = var0 & ~var1 | ~var0 & var1;
      var0 = var10001;
      var10001 = var0 - ~var1 - 1;
      var10002 = (int)4941992115270528832L;
      var1 = 1892342229;
      var0 = var10002;
      var10002 = (var0 | var1) & (~var0 | ~var1);
      var1 = -743704792;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      int var10003 = (int)-7772054166012276106L;
      var1 = -472885487;
      var0 = var10003;
      var10003 = (var0 | var1) & ~(var0 & var1);
      var1 = -1585280050;
      var0 = var10003;
      var1 = (var0 | var1) - (var0 & var1);
      var0 = var10002;
      var10002 = (var0 | var1) + (var0 & var1);
      var10002 = (int)6366254987354397560L;
      var1 = 2067896489;
      var0 = var10002;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = -161580886;
      var0 = var10002;
      var10002 = (var0 | var1) & ~(var0 & var1);
      var1 = 1379815205;
      var0 = -684671328;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = 1042796683;
      var0 = var10003;
      var10003 = ((var0 | var1) & ~(var0 & var1)) * ((var0 | var1) & ~(var0 & var1));
      var10003 = (int)-474700364823281615L;
      var1 = -1410772020;
      var0 = var10003;
      var10003 = (var0 | var1) - (var0 & var1);
      var1 = 1210590400;
      var0 = var10003;
      var10003 = var0 & ~var1 | ~var0 & var1;
      int var10004 = (int)-7447647277933240875L;
      var1 = -1712331240;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1531660786;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var10004 = (int)-8661845703299102397L;
      var1 = -1406303772;
      var0 = var10004;
      var10004 = (var0 | var1) & ~(var0 & var1);
      var1 = 87146272;
      var0 = var10004;
      var10004 = var0 & ~var1 | ~var0 & var1;
      int var10006 = (int)-6722343682046280732L;
      var1 = 1013588063;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1713366088;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var10006 = (int)5652276835224071465L;
      var1 = -1437397531;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 232792271;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var10006 = (int)-4542816844378769110L;
      var1 = -1427641842;
      var0 = var10006;
      var10006 = var0 & ~var1 | ~var0 & var1;
      var1 = -1245474013;
      var0 = var10006;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      int var10005 = (int)-8836329017018500205L;
      var1 = -507681425;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1882180635;
      var0 = var10005;
      String var114 = b("떢\ue3c5떾\ue3c3떷", "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ組蹏⑴謳㑲`ꟓ꒡ꁸ꤉絥", var10002, var10003, var10004, var0 + var1 - 2 * (var0 & var1));
      var10001 = (int)-7760331337801852110L;
      var1 = 98419672;
      var0 = var10001;
      var10001 = (var0 | var1) & ~(var0 & var1);
      var1 = 1775164434;
      var0 = var10001;
      var10001 = var0 + var1 - 2 * (var0 & var1);
      var1 = 2109785755;
      var0 = -500560784;
      var10002 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1311362238;
      var0 = var10002;
      var10002 = var0 & ~var1 | ~var0 & var1;
      var1 = -1847117170;
      var0 = 1107659513;
      var10003 = (var0 | var1) & (~var0 | ~var1);
      var1 = 1670112218;
      var0 = var10003;
      var1 = var0 + var1 - 2 * (var0 & var1);
      var0 = var10002;
      var10002 = (var0 ^ var1) + 2 * (var0 & var1);
      var1 = 892999349;
      var0 = -1981341392;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -468824139;
      var0 = var10003;
      var10003 = (var0 + var1 - 2 * (var0 & var1)) * (var0 + var1 - 2 * (var0 & var1));
      var10003 = (int)3955502566618147498L;
      var1 = -957652369;
      var0 = var10003;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1706134594;
      var0 = var10003;
      var10003 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1727974059;
      var0 = -283201343;
      var10004 = var0 & ~var1 | ~var0 & var1;
      var1 = 1549276517;
      var0 = var10004;
      var10004 = (var0 & ~var1 | ~var0 & var1) * (var0 & ~var1 | ~var0 & var1);
      var10004 = (int)544627105008321527L;
      var1 = -1715526226;
      var0 = var10004;
      var10004 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1868640836;
      var0 = var10004;
      var10004 = var0 + var1 - 2 * (var0 & var1);
      var10005 = (int)151258081797478143L;
      var1 = 1799632503;
      var0 = var10005;
      var10005 = (var0 | var1) & (~var0 | ~var1);
      var1 = -712914882;
      var0 = var10005;
      var10005 = ((var0 | var1) & (~var0 | ~var1)) * ((var0 | var1) & (~var0 | ~var1));
      var1 = -739184839;
      var0 = 122741695;
      var10005 = (var0 | var1) - (var0 & var1);
      var1 = -609531640;
      var0 = var10005;
      var10005 = var0 & ~var1 | ~var0 & var1;
      var1 = -1011040556;
      var0 = 968688515;
      var10006 = var0 + var1 - 2 * (var0 & var1);
      var1 = 1930270718;
      var0 = var10006;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = 2105257944;
      var0 = -2112741319;
      int var10007 = var0 + var1 - 2 * (var0 & var1);
      var1 = -1987034080;
      var0 = var10007;
      var1 = (var0 | var1) & ~(var0 & var1);
      var0 = var10006;
      var10006 = (var0 ^ var1) + 2 * (var0 & var1);
      var1 = 563784115;
      var0 = -1423592080;
      var10006 = (var0 | var1) & (~var0 | ~var1);
      var1 = -1963967230;
      var0 = var10006;
      f = Identifier.of(
         var114, b("떦⼍떪⼜떧⼚떷⼛뗽⼊떾⼇떽⼅뗼⼘떼⼏", "`ꟳꓺꁡꤐ絺蹙⑿譸㑢f\ua7ef꒹ꁢꥊ組蹏⑴謳㑲`ꟓ꒡ꁸ꤉絥", var10003, var10004, var10005, (var0 | var1) & (~var0 | ~var1))
      );
   }

   public static String b(String var0, String var1, int var2, int var3, int var4, int var5) {
      char[] var6 = var1.toCharArray();
      char[] var7 = new char[var6.length];
      int var10000 = (int)287853797351735486L;
      int var20 = 1897539539;
      int var19 = var10000;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1686116505;
      var19 = var10000;
      char[] var272 = new char[(var19 | var20) & (~var19 | ~var20)];
      var20 = 368044508;
      var19 = 387939551;
      int var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 49321219;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 244079483;
      var19 = -1958282388;
      int var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -2050299867;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8275457770869420365L;
      var20 = -798938060;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -2113151624;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -1706816041;
      var19 = 523532725;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2056235033;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)-492102714102272577L;
      var20 = 751134967;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2015937866;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)7654001649268474756L;
      var20 = -680876168;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 1368147834;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 1701640548;
      var19 = 1802329167;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = 234988840;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 64654905;
      var19 = 2065909583;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 549234309;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -827498094;
      var19 = 259088482;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1042507293;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = -1603517199;
      var19 = 1486446101;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -118154528;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var10003 = (int)7660451671678215354L;
      var20 = -334295138;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -387450948;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2092971700;
      var19 = -970525655;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1159310408;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)2530548939722598377L;
      var20 = 2045747330;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 386369390;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -295208572;
      var19 = 2080169504;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -1784946138;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) - (var19 & var20));
      var10002 = (int)3070974614728750827L;
      var20 = -1744618144;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -1457190003;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 587736939;
      var19 = -1538879122;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = -2024882410;
      var19 = var10003;
      var272[var10002] = (char)((var19 | var20) & (~var19 | ~var20));
      var20 = 681229662;
      var19 = -1898004035;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -1505461020;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -930945072;
      var19 = 599462529;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -348536461;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -880959139;
      var19 = 22811094;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -903761789;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var10003 = (int)-6374194021195636079L;
      var20 = 2086733124;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 961949574;
      var19 = var10003;
      var272[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = 1607048963;
      var19 = -1747926037;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = -937861919;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)6131976536155306528L;
      var20 = 1056173043;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = -161294601;
      var19 = var10003;
      var272[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      char[] var8 = var272;
      var20 = -1042165220;
      var19 = -857101802;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = 218658816;
      var19 = var10000;
      char[] var274 = new char[var19 & ~var20 | ~var19 & var20];
      var20 = -1684651817;
      var19 = -234608177;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1771202840;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -533005155;
      var19 = 2077016379;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -1678346874;
      var19 = var10003;
      var274[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8872917269625481237L;
      var20 = -295314863;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 387019333;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      String var359 = "bzs";
      var10003 = (int)-4832936853009432034L;
      var20 = -1283431674;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1979344155;
      var19 = var10003;
      var274[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1884113939;
      var19 = 1415825818;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 607028619;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-5834582018126800751L;
      var20 = -2049526654;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1767349174;
      var19 = var10003;
      var10003 = (var19 + var20 - 2 * (var19 & var20)) * (var19 + var20 - 2 * (var19 & var20));
      var20 = 2020454172;
      var19 = 254108337;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 2001226494;
      var19 = var10003;
      var274[var10002] = (char)((var19 | var20) - (var19 & var20));
      var20 = 972874992;
      var19 = -1908028618;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -1212600379;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var10003 = (int)6773542270907214780L;
      var20 = 540752582;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = -524326536;
      var19 = var10003;
      var274[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -1650289181;
      var19 = -411027429;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 2049093116;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = -789033455;
      var19 = -901104546;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 447891983;
      var19 = var10003;
      var274[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      var20 = 1642271036;
      var19 = 569157132;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 1074771765;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var20 = 1472096451;
      var19 = 834685626;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1719540461;
      var19 = var10003;
      var274[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)-5317994318268276046L;
      var20 = 1802804338;
      var19 = var10002;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = -2056880442;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1115710008;
      var19 = 494921632;
      var10003 = (var19 | var20) - (var19 & var20);
      var20 = 818747422;
      var19 = var10003;
      var10003 = var19 + var20 - 2 * (var19 & var20);
      int var10004 = (int)-5920622726436153398L;
      var20 = -319427045;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1909063530;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = (var19 ^ var20) + 2 * (var19 & var20);
      var10003 = (int)3357929599647629832L;
      var20 = 113332211;
      var19 = var10003;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 17140418;
      var19 = var10003;
      var274[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var20 = -251572372;
      var19 = 1238397286;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1194246643;
      var19 = var10002;
      var10002 = (var19 | var20) & (~var19 | ~var20);
      var20 = -495283945;
      var19 = 1043356910;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = -599073343;
      var19 = var10003;
      var274[var10002] = (char)(var19 + var20 - 2 * (var19 & var20));
      var20 = -683082610;
      var19 = -1358186328;
      var10002 = (var19 | var20) - (var19 & var20);
      var20 = 2017674286;
      var19 = var10002;
      var10002 = (var19 | var20) & ~(var19 & var20);
      var10003 = (int)-4142828951928027801L;
      var20 = -1873022644;
      var19 = var10003;
      var10003 = var19 & ~var20 | ~var19 & var20;
      var20 = 534411420;
      var19 = var10003;
      var10003 = (var19 | var20) - (var19 & var20);
      var10004 = (int)8472095571433792685L;
      var20 = -2074961974;
      var19 = var10004;
      var10004 = var19 + var20 - 2 * (var19 & var20);
      var20 = 1047185391;
      var19 = var10004;
      var20 = (var19 | var20) - (var19 & var20);
      var19 = var10003;
      var10003 = 2 * (var19 | var20) - (var19 ^ var20);
      var10003 = (int)4875406148978721271L;
      var20 = -874797256;
      var19 = var10003;
      var10003 = (var19 | var20) & ~(var19 & var20);
      var20 = 1987765707;
      var19 = var10003;
      var274[var10002] = (char)(var19 & ~var20 | ~var19 & var20);
      var10002 = (int)8127761227048333418L;
      var20 = 977866179;
      var19 = var10002;
      var10002 = var19 + var20 - 2 * (var19 & var20);
      var20 = -819872352;
      var19 = var10002;
      var10002 = var19 & ~var20 | ~var19 & var20;
      var20 = 119700219;
      var19 = 2096282577;
      var10003 = (var19 | var20) & (~var19 | ~var20);
      var20 = 2077291033;
      var19 = var10003;
      var274[var10002] = (char)((var19 | var20) & ~(var19 & var20));
      char[] var9 = var274;
      var20 = -20824007;
      var19 = -1078970044;
      var10000 = (var19 | var20) & (~var19 | ~var20);
      var20 = 1098021245;
      var19 = var10000;

      for (int var10 = var19 + var20 - 2 * (var19 & var20); var10 < var6.length; var10++) {
         char var337 = var6[var10];
         char var248 = var8[var10 % var8.length];
         char var124 = var337;
         var7[var10] = (char)(var124 + var248 - 2 * (var124 & var248));
      }

      char[] var21 = new char[var7.length];
      var10000 = (int)-123580499774041326L;
      var20 = 319651692;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = -1564414850;
      var19 = var10000;
      int var11 = (var19 | var20) & ~(var19 & var20);
      String var278 = "bzt";
      var10000 = (int)4268126417187076117L;
      var20 = 430430294;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -137755158;
      var19 = var10000;
      int var18 = (var19 | var20) & (~var19 | ~var20);
      a = var18;
      var10000 = (int)-5165662519159098751L;
      var20 = 1259823330;
      var19 = var10000;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1589569350;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -1446693148;
      var19 = -348043196;
      int var10001 = (var19 | var20) & ~(var19 & var20);
      var20 = -278273973;
      var19 = var10001;
      var20 = (var19 | var20) & (~var19 | ~var20);
      var19 = var10000;
      var10000 = var19 - ~var20 - 1;
      var20 = 1916051104;
      var19 = 1788366152;
      var10000 = (var19 | var20) - (var19 & var20);
      var20 = 1650111647;
      var19 = var10000;
      if ((var19 | var20) - (var19 & var20) < a) {
         throw new RuntimeException();
      }

      while (var11 < var6.length) {
         char var338 = var7[var11];
         char var260 = var9[var11 % var9.length];
         char var136 = var338;
         var21[var11] = (char)((var136 | var260) & (~var136 | ~var260));
         var11++;
      }

      String var22 = new String(var21);
      int var12 = var22.hashCode();
      var20 = var5;
      var19 = var3;
      var10000 = (var19 & ~var20) - (~var19 & var20);
      var20 = var2;
      var19 = var10000;
      int var13 = 2 * (var19 & ~var20) - (var19 ^ var20);
      char[] var14 = var0.toCharArray();
      char[] var15 = new char[var14.length];
      var10000 = (int)-2002046178282344216L;
      var20 = 1708956168;
      var19 = var10000;
      var10000 = var19 + var20 - 2 * (var19 & var20);
      var20 = -900601120;
      var19 = var10000;

      for (int var16 = var19 & ~var20 | ~var19 & var20; var16 < var15.length; var16++) {
         var10001 = (int)-1200788559631673218L;
         var20 = -1778780597;
         var19 = var10001;
         var10001 = var19 & ~var20 | ~var19 & var20;
         var20 = 1362423351;
         var19 = var10001;
         switch (var16 % (var19 + var20 - 2 * (var19 & var20))) {
            case 0:
               var20 = var12;
               var19 = var13;
               var10002 = (var19 | var20) & ~(var19 & var20);
               char var270 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 + var270 - 2 * (var19 & var270));
               break;
            case 1:
               var20 = var13;
               var19 = var5;
               var10002 = var19 + var20 - 2 * (var19 & var20);
               char var268 = var14[var16];
               var19 = var10002;
               var15[var16] = (char)(var19 & ~var268 | ~var19 & var268);
         }
      }

      return new String(var15);
   }
}
