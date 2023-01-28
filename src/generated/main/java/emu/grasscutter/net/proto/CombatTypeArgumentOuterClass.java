// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombatTypeArgument.proto

public final class CombatTypeArgumentOuterClass {
  private CombatTypeArgumentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CombatTypeArgument}
   */
  public enum CombatTypeArgument
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>COMBAT_TYPE_ARGUMENT_NONE = 0;</code>
     */
    COMBAT_TYPE_ARGUMENT_NONE(0),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT = 1;</code>
     */
    COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT(1),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED = 2;</code>
     */
    COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED(2),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FACE_TO_DIR = 3;</code>
     */
    COMBAT_TYPE_ARGUMENT_FACE_TO_DIR(3),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET = 4;</code>
     */
    COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET(4),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_RUSH_MOVE = 5;</code>
     */
    COMBAT_TYPE_ARGUMENT_RUSH_MOVE(5),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED = 6;</code>
     */
    COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED(6),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ENTITY_MOVE = 7;</code>
     */
    COMBAT_TYPE_ARGUMENT_ENTITY_MOVE(7),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION = 8;</code>
     */
    COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION(8),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO = 9;</code>
     */
    COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO(9),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO = 10;</code>
     */
    COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO(10),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF = 11;</code>
     */
    COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF(11),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK = 12;</code>
     */
    COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK(12),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE = 13;</code>
     */
    COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE(13),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM = 14;</code>
     */
    COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM(14),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE = 15;</code>
     */
    COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE(15),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF = 16;</code>
     */
    COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF(16),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF = 17;</code>
     */
    COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF(17),
    /**
     * <code>COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE = 18;</code>
     */
    COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE(18),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>COMBAT_TYPE_ARGUMENT_NONE = 0;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_NONE_VALUE = 0;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT = 1;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT_VALUE = 1;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED = 2;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED_VALUE = 2;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FACE_TO_DIR = 3;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_FACE_TO_DIR_VALUE = 3;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET = 4;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET_VALUE = 4;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_RUSH_MOVE = 5;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_RUSH_MOVE_VALUE = 5;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED = 6;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED_VALUE = 6;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_ENTITY_MOVE = 7;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_ENTITY_MOVE_VALUE = 7;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION = 8;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION_VALUE = 8;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO = 9;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO_VALUE = 9;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO = 10;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO_VALUE = 10;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF = 11;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF_VALUE = 11;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK = 12;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK_VALUE = 12;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE = 13;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE_VALUE = 13;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM = 14;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM_VALUE = 14;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE = 15;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE_VALUE = 15;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF = 16;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF_VALUE = 16;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF = 17;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF_VALUE = 17;
    /**
     * <code>COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE = 18;</code>
     */
    public static final int COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE_VALUE = 18;


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
    public static CombatTypeArgument valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CombatTypeArgument forNumber(int value) {
      switch (value) {
        case 0: return COMBAT_TYPE_ARGUMENT_NONE;
        case 1: return COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT;
        case 2: return COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED;
        case 3: return COMBAT_TYPE_ARGUMENT_FACE_TO_DIR;
        case 4: return COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET;
        case 5: return COMBAT_TYPE_ARGUMENT_RUSH_MOVE;
        case 6: return COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED;
        case 7: return COMBAT_TYPE_ARGUMENT_ENTITY_MOVE;
        case 8: return COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION;
        case 9: return COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO;
        case 10: return COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO;
        case 11: return COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF;
        case 12: return COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK;
        case 13: return COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE;
        case 14: return COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM;
        case 15: return COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE;
        case 16: return COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF;
        case 17: return COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF;
        case 18: return COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CombatTypeArgument>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CombatTypeArgument> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CombatTypeArgument>() {
            public CombatTypeArgument findValueByNumber(int number) {
              return CombatTypeArgument.forNumber(number);
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
      return CombatTypeArgumentOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CombatTypeArgument[] VALUES = values();

    public static CombatTypeArgument valueOf(
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

    private CombatTypeArgument(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CombatTypeArgument)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CombatTypeArgument.proto*\310\006\n\022CombatTyp" +
      "eArgument\022\035\n\031COMBAT_TYPE_ARGUMENT_NONE\020\000" +
      "\022&\n\"COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT\020\001" +
      "\022/\n+COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_" +
      "CHANGED\020\002\022$\n COMBAT_TYPE_ARGUMENT_FACE_T" +
      "O_DIR\020\003\022*\n&COMBAT_TYPE_ARGUMENT_SET_ATTA" +
      "CK_TARGET\020\004\022\"\n\036COMBAT_TYPE_ARGUMENT_RUSH" +
      "_MOVE\020\005\0223\n/COMBAT_TYPE_ARGUMENT_ANIMATOR" +
      "_PARAMETER_CHANGED\020\006\022$\n COMBAT_TYPE_ARGU" +
      "MENT_ENTITY_MOVE\020\007\022-\n)COMBAT_TYPE_ARGUME" +
      "NT_SYNC_ENTITY_POSITION\020\010\022*\n&COMBAT_TYPE" +
      "_ARGUMENT_STEER_MOTION_INFO\020\t\022+\n\'COMBAT_" +
      "TYPE_ARGUMENT_FORCE_SET_POS_INFO\020\n\022,\n(CO" +
      "MBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF\020\013" +
      "\022)\n%COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLIN" +
      "K\020\014\022(\n$COMBAT_TYPE_ARGUMENT_FIXED_RUSH_M" +
      "OVE\020\r\022\'\n#COMBAT_TYPE_ARGUMENT_SYNC_TRANS" +
      "FORM\020\016\022(\n$COMBAT_TYPE_ARGUMENT_LIGHT_COR" +
      "E_MOVE\020\017\022)\n%COMBAT_TYPE_ARGUMENT_BEING_H" +
      "EALED_NTF\020\020\0222\n.COMBAT_TYPE_ARGUMENT_SKIL" +
      "L_ANCHOR_POSITION_NTF\020\021\022,\n(COMBAT_TYPE_A" +
      "RGUMENT_GRAPPLING_HOOK_MOVE\020\022b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
