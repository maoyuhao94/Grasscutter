// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProtEntityType.proto

public final class ProtEntityTypeOuterClass {
  private ProtEntityTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ProtEntityType}
   */
  public enum ProtEntityType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROT_ENTITY_TYPE_NONE = 0;</code>
     */
    PROT_ENTITY_TYPE_NONE(0),
    /**
     * <code>PROT_ENTITY_TYPE_AVATAR = 1;</code>
     */
    PROT_ENTITY_TYPE_AVATAR(1),
    /**
     * <code>PROT_ENTITY_TYPE_MONSTER = 2;</code>
     */
    PROT_ENTITY_TYPE_MONSTER(2),
    /**
     * <code>PROT_ENTITY_TYPE_NPC = 3;</code>
     */
    PROT_ENTITY_TYPE_NPC(3),
    /**
     * <code>PROT_ENTITY_TYPE_GADGET = 4;</code>
     */
    PROT_ENTITY_TYPE_GADGET(4),
    /**
     * <code>PROT_ENTITY_TYPE_REGION = 5;</code>
     */
    PROT_ENTITY_TYPE_REGION(5),
    /**
     * <code>PROT_ENTITY_TYPE_WEAPON = 6;</code>
     */
    PROT_ENTITY_TYPE_WEAPON(6),
    /**
     * <code>PROT_ENTITY_TYPE_WEATHER = 7;</code>
     */
    PROT_ENTITY_TYPE_WEATHER(7),
    /**
     * <code>PROT_ENTITY_TYPE_SCENE = 8;</code>
     */
    PROT_ENTITY_TYPE_SCENE(8),
    /**
     * <code>PROT_ENTITY_TYPE_TEAM = 9;</code>
     */
    PROT_ENTITY_TYPE_TEAM(9),
    /**
     * <code>PROT_ENTITY_TYPE_MASSIVE_ENTITY = 10;</code>
     */
    PROT_ENTITY_TYPE_MASSIVE_ENTITY(10),
    /**
     * <code>PROT_ENTITY_TYPE_MP_LEVEL = 11;</code>
     */
    PROT_ENTITY_TYPE_MP_LEVEL(11),
    /**
     * <code>PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY = 12;</code>
     */
    PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY(12),
    /**
     * <code>PROT_ENTITY_TYPE_EYE_POINT = 13;</code>
     */
    PROT_ENTITY_TYPE_EYE_POINT(13),
    /**
     * <code>PROT_ENTITY_TYPE_MAX = 14;</code>
     */
    PROT_ENTITY_TYPE_MAX(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>PROT_ENTITY_TYPE_NONE = 0;</code>
     */
    public static final int PROT_ENTITY_TYPE_NONE_VALUE = 0;
    /**
     * <code>PROT_ENTITY_TYPE_AVATAR = 1;</code>
     */
    public static final int PROT_ENTITY_TYPE_AVATAR_VALUE = 1;
    /**
     * <code>PROT_ENTITY_TYPE_MONSTER = 2;</code>
     */
    public static final int PROT_ENTITY_TYPE_MONSTER_VALUE = 2;
    /**
     * <code>PROT_ENTITY_TYPE_NPC = 3;</code>
     */
    public static final int PROT_ENTITY_TYPE_NPC_VALUE = 3;
    /**
     * <code>PROT_ENTITY_TYPE_GADGET = 4;</code>
     */
    public static final int PROT_ENTITY_TYPE_GADGET_VALUE = 4;
    /**
     * <code>PROT_ENTITY_TYPE_REGION = 5;</code>
     */
    public static final int PROT_ENTITY_TYPE_REGION_VALUE = 5;
    /**
     * <code>PROT_ENTITY_TYPE_WEAPON = 6;</code>
     */
    public static final int PROT_ENTITY_TYPE_WEAPON_VALUE = 6;
    /**
     * <code>PROT_ENTITY_TYPE_WEATHER = 7;</code>
     */
    public static final int PROT_ENTITY_TYPE_WEATHER_VALUE = 7;
    /**
     * <code>PROT_ENTITY_TYPE_SCENE = 8;</code>
     */
    public static final int PROT_ENTITY_TYPE_SCENE_VALUE = 8;
    /**
     * <code>PROT_ENTITY_TYPE_TEAM = 9;</code>
     */
    public static final int PROT_ENTITY_TYPE_TEAM_VALUE = 9;
    /**
     * <code>PROT_ENTITY_TYPE_MASSIVE_ENTITY = 10;</code>
     */
    public static final int PROT_ENTITY_TYPE_MASSIVE_ENTITY_VALUE = 10;
    /**
     * <code>PROT_ENTITY_TYPE_MP_LEVEL = 11;</code>
     */
    public static final int PROT_ENTITY_TYPE_MP_LEVEL_VALUE = 11;
    /**
     * <code>PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY = 12;</code>
     */
    public static final int PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY_VALUE = 12;
    /**
     * <code>PROT_ENTITY_TYPE_EYE_POINT = 13;</code>
     */
    public static final int PROT_ENTITY_TYPE_EYE_POINT_VALUE = 13;
    /**
     * <code>PROT_ENTITY_TYPE_MAX = 14;</code>
     */
    public static final int PROT_ENTITY_TYPE_MAX_VALUE = 14;


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
    public static ProtEntityType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtEntityType forNumber(int value) {
      switch (value) {
        case 0: return PROT_ENTITY_TYPE_NONE;
        case 1: return PROT_ENTITY_TYPE_AVATAR;
        case 2: return PROT_ENTITY_TYPE_MONSTER;
        case 3: return PROT_ENTITY_TYPE_NPC;
        case 4: return PROT_ENTITY_TYPE_GADGET;
        case 5: return PROT_ENTITY_TYPE_REGION;
        case 6: return PROT_ENTITY_TYPE_WEAPON;
        case 7: return PROT_ENTITY_TYPE_WEATHER;
        case 8: return PROT_ENTITY_TYPE_SCENE;
        case 9: return PROT_ENTITY_TYPE_TEAM;
        case 10: return PROT_ENTITY_TYPE_MASSIVE_ENTITY;
        case 11: return PROT_ENTITY_TYPE_MP_LEVEL;
        case 12: return PROT_ENTITY_TYPE_PLAY_TEAM_ENTITY;
        case 13: return PROT_ENTITY_TYPE_EYE_POINT;
        case 14: return PROT_ENTITY_TYPE_MAX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtEntityType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtEntityType>() {
            public ProtEntityType findValueByNumber(int number) {
              return ProtEntityType.forNumber(number);
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
      return ProtEntityTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProtEntityType[] VALUES = values();

    public static ProtEntityType valueOf(
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

    private ProtEntityType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ProtEntityType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ProtEntityType.proto*\321\003\n\016ProtEntityTyp" +
      "e\022\031\n\025PROT_ENTITY_TYPE_NONE\020\000\022\033\n\027PROT_ENT" +
      "ITY_TYPE_AVATAR\020\001\022\034\n\030PROT_ENTITY_TYPE_MO" +
      "NSTER\020\002\022\030\n\024PROT_ENTITY_TYPE_NPC\020\003\022\033\n\027PRO" +
      "T_ENTITY_TYPE_GADGET\020\004\022\033\n\027PROT_ENTITY_TY" +
      "PE_REGION\020\005\022\033\n\027PROT_ENTITY_TYPE_WEAPON\020\006" +
      "\022\034\n\030PROT_ENTITY_TYPE_WEATHER\020\007\022\032\n\026PROT_E" +
      "NTITY_TYPE_SCENE\020\010\022\031\n\025PROT_ENTITY_TYPE_T" +
      "EAM\020\t\022#\n\037PROT_ENTITY_TYPE_MASSIVE_ENTITY" +
      "\020\n\022\035\n\031PROT_ENTITY_TYPE_MP_LEVEL\020\013\022%\n!PRO" +
      "T_ENTITY_TYPE_PLAY_TEAM_ENTITY\020\014\022\036\n\032PROT" +
      "_ENTITY_TYPE_EYE_POINT\020\r\022\030\n\024PROT_ENTITY_" +
      "TYPE_MAX\020\016b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
