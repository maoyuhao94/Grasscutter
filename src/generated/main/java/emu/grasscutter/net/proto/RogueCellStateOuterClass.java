// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RogueCellState.proto

public final class RogueCellStateOuterClass {
  private RogueCellStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code RogueCellState}
   */
  public enum RogueCellState
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ROGUE_CELL_STATE_NONE = 0;</code>
     */
    ROGUE_CELL_STATE_NONE(0),
    /**
     * <code>ROGUE_CELL_STATE_BATTLE = 1;</code>
     */
    ROGUE_CELL_STATE_BATTLE(1),
    /**
     * <code>ROGUE_CELL_STATE_SUCCESS = 2;</code>
     */
    ROGUE_CELL_STATE_SUCCESS(2),
    /**
     * <code>ROGUE_CELL_STATE_FINISH = 3;</code>
     */
    ROGUE_CELL_STATE_FINISH(3),
    /**
     * <code>ROGUE_CELL_STATE_TAKEN_CHEST = 4;</code>
     */
    ROGUE_CELL_STATE_TAKEN_CHEST(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ROGUE_CELL_STATE_NONE = 0;</code>
     */
    public static final int ROGUE_CELL_STATE_NONE_VALUE = 0;
    /**
     * <code>ROGUE_CELL_STATE_BATTLE = 1;</code>
     */
    public static final int ROGUE_CELL_STATE_BATTLE_VALUE = 1;
    /**
     * <code>ROGUE_CELL_STATE_SUCCESS = 2;</code>
     */
    public static final int ROGUE_CELL_STATE_SUCCESS_VALUE = 2;
    /**
     * <code>ROGUE_CELL_STATE_FINISH = 3;</code>
     */
    public static final int ROGUE_CELL_STATE_FINISH_VALUE = 3;
    /**
     * <code>ROGUE_CELL_STATE_TAKEN_CHEST = 4;</code>
     */
    public static final int ROGUE_CELL_STATE_TAKEN_CHEST_VALUE = 4;


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
    public static RogueCellState valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RogueCellState forNumber(int value) {
      switch (value) {
        case 0: return ROGUE_CELL_STATE_NONE;
        case 1: return ROGUE_CELL_STATE_BATTLE;
        case 2: return ROGUE_CELL_STATE_SUCCESS;
        case 3: return ROGUE_CELL_STATE_FINISH;
        case 4: return ROGUE_CELL_STATE_TAKEN_CHEST;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RogueCellState>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RogueCellState> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RogueCellState>() {
            public RogueCellState findValueByNumber(int number) {
              return RogueCellState.forNumber(number);
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
      return RogueCellStateOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RogueCellState[] VALUES = values();

    public static RogueCellState valueOf(
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

    private RogueCellState(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RogueCellState)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024RogueCellState.proto*\245\001\n\016RogueCellStat" +
      "e\022\031\n\025ROGUE_CELL_STATE_NONE\020\000\022\033\n\027ROGUE_CE" +
      "LL_STATE_BATTLE\020\001\022\034\n\030ROGUE_CELL_STATE_SU" +
      "CCESS\020\002\022\033\n\027ROGUE_CELL_STATE_FINISH\020\003\022 \n\034" +
      "ROGUE_CELL_STATE_TAKEN_CHEST\020\004b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
