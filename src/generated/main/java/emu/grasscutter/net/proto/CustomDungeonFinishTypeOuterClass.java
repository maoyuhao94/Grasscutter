// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDungeonFinishType.proto

public final class CustomDungeonFinishTypeOuterClass {
  private CustomDungeonFinishTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CustomDungeonFinishType}
   */
  public enum CustomDungeonFinishType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL = 0;</code>
     */
    CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL(0),
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY = 1;</code>
     */
    CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY(1),
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY = 2;</code>
     */
    CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY(2),
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL = 3;</code>
     */
    CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL = 0;</code>
     */
    public static final int CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL_VALUE = 0;
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY = 1;</code>
     */
    public static final int CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY_VALUE = 1;
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY = 2;</code>
     */
    public static final int CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY_VALUE = 2;
    /**
     * <code>CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL = 3;</code>
     */
    public static final int CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL_VALUE = 3;


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
    public static CustomDungeonFinishType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomDungeonFinishType forNumber(int value) {
      switch (value) {
        case 0: return CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL;
        case 1: return CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY;
        case 2: return CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY;
        case 3: return CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomDungeonFinishType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomDungeonFinishType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomDungeonFinishType>() {
            public CustomDungeonFinishType findValueByNumber(int number) {
              return CustomDungeonFinishType.forNumber(number);
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
      return CustomDungeonFinishTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomDungeonFinishType[] VALUES = values();

    public static CustomDungeonFinishType valueOf(
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

    private CustomDungeonFinishType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CustomDungeonFinishType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035CustomDungeonFinishType.proto*\310\001\n\027Cust" +
      "omDungeonFinishType\022*\n&CUSTOM_DUNGEON_FI" +
      "NISH_TYPE_PLAY_NORMAL\020\000\022\'\n#CUSTOM_DUNGEO" +
      "N_FINISH_TYPE_PLAY_TRY\020\001\022\'\n#CUSTOM_DUNGE" +
      "ON_FINISH_TYPE_EDIT_TRY\020\002\022/\n+CUSTOM_DUNG" +
      "EON_FINISH_TYPE_SELF_PLAY_NORMAL\020\003b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
