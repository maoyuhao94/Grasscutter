// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryCustomDungeonType.proto

public final class TryCustomDungeonTypeOuterClass {
  private TryCustomDungeonTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code TryCustomDungeonType}
   */
  public enum TryCustomDungeonType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_NONE = 0;</code>
     */
    TRY_CUSTOM_DUNGEON_TYPE_NONE(0),
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_ROOM = 1;</code>
     */
    TRY_CUSTOM_DUNGEON_TYPE_ROOM(1),
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_ALL = 2;</code>
     */
    TRY_CUSTOM_DUNGEON_TYPE_ALL(2),
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY = 3;</code>
     */
    TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_NONE = 0;</code>
     */
    public static final int TRY_CUSTOM_DUNGEON_TYPE_NONE_VALUE = 0;
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_ROOM = 1;</code>
     */
    public static final int TRY_CUSTOM_DUNGEON_TYPE_ROOM_VALUE = 1;
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_ALL = 2;</code>
     */
    public static final int TRY_CUSTOM_DUNGEON_TYPE_ALL_VALUE = 2;
    /**
     * <code>TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY = 3;</code>
     */
    public static final int TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY_VALUE = 3;


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
    public static TryCustomDungeonType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TryCustomDungeonType forNumber(int value) {
      switch (value) {
        case 0: return TRY_CUSTOM_DUNGEON_TYPE_NONE;
        case 1: return TRY_CUSTOM_DUNGEON_TYPE_ROOM;
        case 2: return TRY_CUSTOM_DUNGEON_TYPE_ALL;
        case 3: return TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TryCustomDungeonType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TryCustomDungeonType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TryCustomDungeonType>() {
            public TryCustomDungeonType findValueByNumber(int number) {
              return TryCustomDungeonType.forNumber(number);
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
      return TryCustomDungeonTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final TryCustomDungeonType[] VALUES = values();

    public static TryCustomDungeonType valueOf(
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

    private TryCustomDungeonType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:TryCustomDungeonType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TryCustomDungeonType.proto*\246\001\n\024TryCust" +
      "omDungeonType\022 \n\034TRY_CUSTOM_DUNGEON_TYPE" +
      "_NONE\020\000\022 \n\034TRY_CUSTOM_DUNGEON_TYPE_ROOM\020" +
      "\001\022\037\n\033TRY_CUSTOM_DUNGEON_TYPE_ALL\020\002\022)\n%TR" +
      "Y_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY\020\003b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
