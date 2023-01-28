// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VisionType.proto

public final class VisionTypeOuterClass {
  private VisionTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code VisionType}
   */
  public enum VisionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>VISION_TYPE_NONE = 0;</code>
     */
    VISION_TYPE_NONE(0),
    /**
     * <code>VISION_TYPE_MEET = 1;</code>
     */
    VISION_TYPE_MEET(1),
    /**
     * <code>VISION_TYPE_REBORN = 2;</code>
     */
    VISION_TYPE_REBORN(2),
    /**
     * <code>VISION_TYPE_REPLACE = 3;</code>
     */
    VISION_TYPE_REPLACE(3),
    /**
     * <code>VISION_TYPE_WAYPOINT_REBORN = 4;</code>
     */
    VISION_TYPE_WAYPOINT_REBORN(4),
    /**
     * <code>VISION_TYPE_MISS = 5;</code>
     */
    VISION_TYPE_MISS(5),
    /**
     * <code>VISION_TYPE_DIE = 6;</code>
     */
    VISION_TYPE_DIE(6),
    /**
     * <code>VISION_TYPE_GATHER_ESCAPE = 7;</code>
     */
    VISION_TYPE_GATHER_ESCAPE(7),
    /**
     * <code>VISION_TYPE_REFRESH = 8;</code>
     */
    VISION_TYPE_REFRESH(8),
    /**
     * <code>VISION_TYPE_TRANSPORT = 9;</code>
     */
    VISION_TYPE_TRANSPORT(9),
    /**
     * <code>VISION_TYPE_REPLACE_DIE = 10;</code>
     */
    VISION_TYPE_REPLACE_DIE(10),
    /**
     * <code>VISION_TYPE_REPLACE_NO_NOTIFY = 11;</code>
     */
    VISION_TYPE_REPLACE_NO_NOTIFY(11),
    /**
     * <code>VISION_TYPE_BORN = 12;</code>
     */
    VISION_TYPE_BORN(12),
    /**
     * <code>VISION_TYPE_PICKUP = 13;</code>
     */
    VISION_TYPE_PICKUP(13),
    /**
     * <code>VISION_TYPE_REMOVE = 14;</code>
     */
    VISION_TYPE_REMOVE(14),
    /**
     * <code>VISION_TYPE_CHANGE_COSTUME = 15;</code>
     */
    VISION_TYPE_CHANGE_COSTUME(15),
    /**
     * <code>VISION_TYPE_FISH_REFRESH = 16;</code>
     */
    VISION_TYPE_FISH_REFRESH(16),
    /**
     * <code>VISION_TYPE_FISH_BIG_SHOCK = 17;</code>
     */
    VISION_TYPE_FISH_BIG_SHOCK(17),
    /**
     * <code>VISION_TYPE_FISH_QTE_SUCC = 18;</code>
     */
    VISION_TYPE_FISH_QTE_SUCC(18),
    /**
     * <code>VISION_TYPE_CAPTURE_DISAPPEAR = 19;</code>
     */
    VISION_TYPE_CAPTURE_DISAPPEAR(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>VISION_TYPE_NONE = 0;</code>
     */
    public static final int VISION_TYPE_NONE_VALUE = 0;
    /**
     * <code>VISION_TYPE_MEET = 1;</code>
     */
    public static final int VISION_TYPE_MEET_VALUE = 1;
    /**
     * <code>VISION_TYPE_REBORN = 2;</code>
     */
    public static final int VISION_TYPE_REBORN_VALUE = 2;
    /**
     * <code>VISION_TYPE_REPLACE = 3;</code>
     */
    public static final int VISION_TYPE_REPLACE_VALUE = 3;
    /**
     * <code>VISION_TYPE_WAYPOINT_REBORN = 4;</code>
     */
    public static final int VISION_TYPE_WAYPOINT_REBORN_VALUE = 4;
    /**
     * <code>VISION_TYPE_MISS = 5;</code>
     */
    public static final int VISION_TYPE_MISS_VALUE = 5;
    /**
     * <code>VISION_TYPE_DIE = 6;</code>
     */
    public static final int VISION_TYPE_DIE_VALUE = 6;
    /**
     * <code>VISION_TYPE_GATHER_ESCAPE = 7;</code>
     */
    public static final int VISION_TYPE_GATHER_ESCAPE_VALUE = 7;
    /**
     * <code>VISION_TYPE_REFRESH = 8;</code>
     */
    public static final int VISION_TYPE_REFRESH_VALUE = 8;
    /**
     * <code>VISION_TYPE_TRANSPORT = 9;</code>
     */
    public static final int VISION_TYPE_TRANSPORT_VALUE = 9;
    /**
     * <code>VISION_TYPE_REPLACE_DIE = 10;</code>
     */
    public static final int VISION_TYPE_REPLACE_DIE_VALUE = 10;
    /**
     * <code>VISION_TYPE_REPLACE_NO_NOTIFY = 11;</code>
     */
    public static final int VISION_TYPE_REPLACE_NO_NOTIFY_VALUE = 11;
    /**
     * <code>VISION_TYPE_BORN = 12;</code>
     */
    public static final int VISION_TYPE_BORN_VALUE = 12;
    /**
     * <code>VISION_TYPE_PICKUP = 13;</code>
     */
    public static final int VISION_TYPE_PICKUP_VALUE = 13;
    /**
     * <code>VISION_TYPE_REMOVE = 14;</code>
     */
    public static final int VISION_TYPE_REMOVE_VALUE = 14;
    /**
     * <code>VISION_TYPE_CHANGE_COSTUME = 15;</code>
     */
    public static final int VISION_TYPE_CHANGE_COSTUME_VALUE = 15;
    /**
     * <code>VISION_TYPE_FISH_REFRESH = 16;</code>
     */
    public static final int VISION_TYPE_FISH_REFRESH_VALUE = 16;
    /**
     * <code>VISION_TYPE_FISH_BIG_SHOCK = 17;</code>
     */
    public static final int VISION_TYPE_FISH_BIG_SHOCK_VALUE = 17;
    /**
     * <code>VISION_TYPE_FISH_QTE_SUCC = 18;</code>
     */
    public static final int VISION_TYPE_FISH_QTE_SUCC_VALUE = 18;
    /**
     * <code>VISION_TYPE_CAPTURE_DISAPPEAR = 19;</code>
     */
    public static final int VISION_TYPE_CAPTURE_DISAPPEAR_VALUE = 19;


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
    public static VisionType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VisionType forNumber(int value) {
      switch (value) {
        case 0: return VISION_TYPE_NONE;
        case 1: return VISION_TYPE_MEET;
        case 2: return VISION_TYPE_REBORN;
        case 3: return VISION_TYPE_REPLACE;
        case 4: return VISION_TYPE_WAYPOINT_REBORN;
        case 5: return VISION_TYPE_MISS;
        case 6: return VISION_TYPE_DIE;
        case 7: return VISION_TYPE_GATHER_ESCAPE;
        case 8: return VISION_TYPE_REFRESH;
        case 9: return VISION_TYPE_TRANSPORT;
        case 10: return VISION_TYPE_REPLACE_DIE;
        case 11: return VISION_TYPE_REPLACE_NO_NOTIFY;
        case 12: return VISION_TYPE_BORN;
        case 13: return VISION_TYPE_PICKUP;
        case 14: return VISION_TYPE_REMOVE;
        case 15: return VISION_TYPE_CHANGE_COSTUME;
        case 16: return VISION_TYPE_FISH_REFRESH;
        case 17: return VISION_TYPE_FISH_BIG_SHOCK;
        case 18: return VISION_TYPE_FISH_QTE_SUCC;
        case 19: return VISION_TYPE_CAPTURE_DISAPPEAR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VisionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VisionType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VisionType>() {
            public VisionType findValueByNumber(int number) {
              return VisionType.forNumber(number);
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
      return VisionTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final VisionType[] VALUES = values();

    public static VisionType valueOf(
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

    private VisionType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:VisionType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020VisionType.proto*\256\004\n\nVisionType\022\024\n\020VIS" +
      "ION_TYPE_NONE\020\000\022\024\n\020VISION_TYPE_MEET\020\001\022\026\n" +
      "\022VISION_TYPE_REBORN\020\002\022\027\n\023VISION_TYPE_REP" +
      "LACE\020\003\022\037\n\033VISION_TYPE_WAYPOINT_REBORN\020\004\022" +
      "\024\n\020VISION_TYPE_MISS\020\005\022\023\n\017VISION_TYPE_DIE" +
      "\020\006\022\035\n\031VISION_TYPE_GATHER_ESCAPE\020\007\022\027\n\023VIS" +
      "ION_TYPE_REFRESH\020\010\022\031\n\025VISION_TYPE_TRANSP" +
      "ORT\020\t\022\033\n\027VISION_TYPE_REPLACE_DIE\020\n\022!\n\035VI" +
      "SION_TYPE_REPLACE_NO_NOTIFY\020\013\022\024\n\020VISION_" +
      "TYPE_BORN\020\014\022\026\n\022VISION_TYPE_PICKUP\020\r\022\026\n\022V" +
      "ISION_TYPE_REMOVE\020\016\022\036\n\032VISION_TYPE_CHANG" +
      "E_COSTUME\020\017\022\034\n\030VISION_TYPE_FISH_REFRESH\020" +
      "\020\022\036\n\032VISION_TYPE_FISH_BIG_SHOCK\020\021\022\035\n\031VIS" +
      "ION_TYPE_FISH_QTE_SUCC\020\022\022!\n\035VISION_TYPE_" +
      "CAPTURE_DISAPPEAR\020\023b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
