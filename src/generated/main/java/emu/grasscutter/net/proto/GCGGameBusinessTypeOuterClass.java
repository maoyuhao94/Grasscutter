// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGGameBusinessType.proto

public final class GCGGameBusinessTypeOuterClass {
  private GCGGameBusinessTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GCGGameBusinessType}
   */
  public enum GCGGameBusinessType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_NONE = 0;</code>
     */
    GCG_GAME_BUSINESS_TYPE_NONE(0),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_GM = 1;</code>
     */
    GCG_GAME_BUSINESS_TYPE_GM(1),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_MATCH = 2;</code>
     */
    GCG_GAME_BUSINESS_TYPE_MATCH(2),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_PVP = 3;</code>
     */
    GCG_GAME_BUSINESS_TYPE_PVP(3),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE = 4;</code>
     */
    GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE(4),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE = 5;</code>
     */
    GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE(5),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE = 6;</code>
     */
    GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE(6),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE = 7;</code>
     */
    GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE(7),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE = 8;</code>
     */
    GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE(8),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_BREAK_CHALLENGE = 9;</code>
     */
    GCG_GAME_BUSINESS_TYPE_BREAK_CHALLENGE(9),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_QUEST = 10;</code>
     */
    GCG_GAME_BUSINESS_TYPE_QUEST(10),
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP = 11;</code>
     */
    GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP(11),
    /**
     * <code>KOGBPIPKHNF = 12;</code>
     */
    KOGBPIPKHNF(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_GAME_BUSINESS_TYPE_NONE = 0;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_NONE_VALUE = 0;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_GM = 1;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_GM_VALUE = 1;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_MATCH = 2;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_MATCH_VALUE = 2;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_PVP = 3;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_PVP_VALUE = 3;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE = 4;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE_VALUE = 4;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE = 5;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE_VALUE = 5;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE = 6;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE_VALUE = 6;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE = 7;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE_VALUE = 7;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE = 8;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE_VALUE = 8;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_BREAK_CHALLENGE = 9;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_BREAK_CHALLENGE_VALUE = 9;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_QUEST = 10;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_QUEST_VALUE = 10;
    /**
     * <code>GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP = 11;</code>
     */
    public static final int GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP_VALUE = 11;
    /**
     * <code>KOGBPIPKHNF = 12;</code>
     */
    public static final int KOGBPIPKHNF_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GCGGameBusinessType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGGameBusinessType forNumber(int value) {
      switch (value) {
        case 0: return GCG_GAME_BUSINESS_TYPE_NONE;
        case 1: return GCG_GAME_BUSINESS_TYPE_GM;
        case 2: return GCG_GAME_BUSINESS_TYPE_MATCH;
        case 3: return GCG_GAME_BUSINESS_TYPE_PVP;
        case 4: return GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE;
        case 5: return GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE;
        case 6: return GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE;
        case 7: return GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE;
        case 8: return GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE;
        case 9: return GCG_GAME_BUSINESS_TYPE_BREAK_CHALLENGE;
        case 10: return GCG_GAME_BUSINESS_TYPE_QUEST;
        case 11: return GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP;
        case 12: return KOGBPIPKHNF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGGameBusinessType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGGameBusinessType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGGameBusinessType>() {
            public GCGGameBusinessType findValueByNumber(int number) {
              return GCGGameBusinessType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return GCGGameBusinessTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGGameBusinessType[] VALUES = values();

    public static GCGGameBusinessType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GCGGameBusinessType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGGameBusinessType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031GCGGameBusinessType.proto*\371\003\n\023GCGGameB" +
      "usinessType\022\037\n\033GCG_GAME_BUSINESS_TYPE_NO" +
      "NE\020\000\022\035\n\031GCG_GAME_BUSINESS_TYPE_GM\020\001\022 \n\034G" +
      "CG_GAME_BUSINESS_TYPE_MATCH\020\002\022\036\n\032GCG_GAM" +
      "E_BUSINESS_TYPE_PVP\020\003\022+\n\'GCG_GAME_BUSINE" +
      "SS_TYPE_TAVERN_CHALLENGE\020\004\022*\n&GCG_GAME_B" +
      "USINESS_TYPE_CONST_CHALLENGE\020\005\022*\n&GCG_GA" +
      "ME_BUSINESS_TYPE_WORLD_CHALLENGE\020\006\022)\n%GC" +
      "G_GAME_BUSINESS_TYPE_BOSS_CHALLENGE\020\007\022)\n" +
      "%GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE\020\010" +
      "\022*\n&GCG_GAME_BUSINESS_TYPE_BREAK_CHALLEN" +
      "GE\020\t\022 \n\034GCG_GAME_BUSINESS_TYPE_QUEST\020\n\022&" +
      "\n\"GCG_GAME_BUSINESS_TYPE_GUIDE_GROUP\020\013\022\017" +
      "\n\013KOGBPIPKHNF\020\014b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
