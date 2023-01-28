// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerPreEnterMpNotify.proto

public final class PlayerPreEnterMpNotifyOuterClass {
  private PlayerPreEnterMpNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerPreEnterMpNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerPreEnterMpNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.State state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    int getStateValue();
    /**
     * <code>.State state = 7;</code>
     * @return The state.
     */
    StateOuterClass.State getState();

    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>string nickname = 15;</code>
     * @return The nickname.
     */
    java.lang.String getNickname();
    /**
     * <code>string nickname = 15;</code>
     * @return The bytes for nickname.
     */
    com.google.protobuf.ByteString
        getNicknameBytes();
  }
  /**
   * Protobuf type {@code PlayerPreEnterMpNotify}
   */
  public static final class PlayerPreEnterMpNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerPreEnterMpNotify)
      PlayerPreEnterMpNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerPreEnterMpNotify.newBuilder() to construct.
    private PlayerPreEnterMpNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerPreEnterMpNotify() {
      state_ = 0;
      nickname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerPreEnterMpNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerPreEnterMpNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 56: {
              int rawValue = input.readEnum();

              state_ = rawValue;
              break;
            }
            case 80: {

              uid_ = input.readUInt32();
              break;
            }
            case 122: {
              java.lang.String s = input.readStringRequireUtf8();

              nickname_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.class, PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerPreEnterMpNotify.GJAPOFHOFMD}
     */
    public enum GJAPOFHOFMD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1835;</code>
       */
      PEPPOHPHJOJ(1, 1835),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final GJAPOFHOFMD DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1835;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1835;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
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
      public static GJAPOFHOFMD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static GJAPOFHOFMD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1835: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<GJAPOFHOFMD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          GJAPOFHOFMD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GJAPOFHOFMD>() {
              public GJAPOFHOFMD findValueByNumber(int number) {
                return GJAPOFHOFMD.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final GJAPOFHOFMD[] VALUES = getStaticValuesArray();
      private static GJAPOFHOFMD[] getStaticValuesArray() {
        return new GJAPOFHOFMD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static GJAPOFHOFMD valueOf(
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

      private final int index;
      private final int value;

      private GJAPOFHOFMD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerPreEnterMpNotify.GJAPOFHOFMD)
    }

    public static final int STATE_FIELD_NUMBER = 7;
    private int state_;
    /**
     * <code>.State state = 7;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.State state = 7;</code>
     * @return The state.
     */
    @java.lang.Override public StateOuterClass.State getState() {
      @SuppressWarnings("deprecation")
      StateOuterClass.State result = StateOuterClass.State.valueOf(state_);
      return result == null ? StateOuterClass.State.UNRECOGNIZED : result;
    }

    public static final int UID_FIELD_NUMBER = 10;
    private int uid_;
    /**
     * <code>uint32 uid = 10;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int NICKNAME_FIELD_NUMBER = 15;
    private volatile java.lang.Object nickname_;
    /**
     * <code>string nickname = 15;</code>
     * @return The nickname.
     */
    @java.lang.Override
    public java.lang.String getNickname() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nickname_ = s;
        return s;
      }
    }
    /**
     * <code>string nickname = 15;</code>
     * @return The bytes for nickname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNicknameBytes() {
      java.lang.Object ref = nickname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nickname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (state_ != StateOuterClass.State.STATE_INVALID.getNumber()) {
        output.writeEnum(7, state_);
      }
      if (uid_ != 0) {
        output.writeUInt32(10, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 15, nickname_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (state_ != StateOuterClass.State.STATE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, state_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, uid_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nickname_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(15, nickname_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify)) {
        return super.equals(obj);
      }
      PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify other = (PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify) obj;

      if (state_ != other.state_) return false;
      if (getUid()
          != other.getUid()) return false;
      if (!getNickname()
          .equals(other.getNickname())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STATE_FIELD_NUMBER;
      hash = (53 * hash) + state_;
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + NICKNAME_FIELD_NUMBER;
      hash = (53 * hash) + getNickname().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerPreEnterMpNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerPreEnterMpNotify)
        PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.class, PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.Builder.class);
      }

      // Construct using PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        state_ = 0;

        uid_ = 0;

        nickname_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return PlayerPreEnterMpNotifyOuterClass.internal_static_PlayerPreEnterMpNotify_descriptor;
      }

      @java.lang.Override
      public PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstanceForType() {
        return PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDefaultInstance();
      }

      @java.lang.Override
      public PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify build() {
        PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify buildPartial() {
        PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify result = new PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify(this);
        result.state_ = state_;
        result.uid_ = uid_;
        result.nickname_ = nickname_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify) {
          return mergeFrom((PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify other) {
        if (other == PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify.getDefaultInstance()) return this;
        if (other.state_ != 0) {
          setStateValue(other.getStateValue());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (!other.getNickname().isEmpty()) {
          nickname_ = other.nickname_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int state_ = 0;
      /**
       * <code>.State state = 7;</code>
       * @return The enum numeric value on the wire for state.
       */
      @java.lang.Override public int getStateValue() {
        return state_;
      }
      /**
       * <code>.State state = 7;</code>
       * @param value The enum numeric value on the wire for state to set.
       * @return This builder for chaining.
       */
      public Builder setStateValue(int value) {
        
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.State state = 7;</code>
       * @return The state.
       */
      @java.lang.Override
      public StateOuterClass.State getState() {
        @SuppressWarnings("deprecation")
        StateOuterClass.State result = StateOuterClass.State.valueOf(state_);
        return result == null ? StateOuterClass.State.UNRECOGNIZED : result;
      }
      /**
       * <code>.State state = 7;</code>
       * @param value The state to set.
       * @return This builder for chaining.
       */
      public Builder setState(StateOuterClass.State value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        state_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.State state = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearState() {
        
        state_ = 0;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 10;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object nickname_ = "";
      /**
       * <code>string nickname = 15;</code>
       * @return The nickname.
       */
      public java.lang.String getNickname() {
        java.lang.Object ref = nickname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          nickname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string nickname = 15;</code>
       * @return The bytes for nickname.
       */
      public com.google.protobuf.ByteString
          getNicknameBytes() {
        java.lang.Object ref = nickname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nickname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string nickname = 15;</code>
       * @param value The nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNickname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        nickname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNickname() {
        
        nickname_ = getDefaultInstance().getNickname();
        onChanged();
        return this;
      }
      /**
       * <code>string nickname = 15;</code>
       * @param value The bytes for nickname to set.
       * @return This builder for chaining.
       */
      public Builder setNicknameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        nickname_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerPreEnterMpNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerPreEnterMpNotify)
    private static final PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify();
    }

    public static PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerPreEnterMpNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerPreEnterMpNotify>() {
      @java.lang.Override
      public PlayerPreEnterMpNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerPreEnterMpNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerPreEnterMpNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerPreEnterMpNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public PlayerPreEnterMpNotifyOuterClass.PlayerPreEnterMpNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPreEnterMpNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPreEnterMpNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034PlayerPreEnterMpNotify.proto\032\013State.pr" +
      "oto\"\237\001\n\026PlayerPreEnterMpNotify\022\025\n\005state\030" +
      "\007 \001(\0162\006.State\022\013\n\003uid\030\n \001(\r\022\020\n\010nickname\030\017" +
      " \001(\t\"O\n\013GJAPOFHOFMD\022\010\n\004NONE\020\000\022\020\n\013PEPPOHP" +
      "HJOJ\020\253\016\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020" +
      "\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          StateOuterClass.getDescriptor(),
        });
    internal_static_PlayerPreEnterMpNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerPreEnterMpNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPreEnterMpNotify_descriptor,
        new java.lang.String[] { "State", "Uid", "Nickname", });
    StateOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
