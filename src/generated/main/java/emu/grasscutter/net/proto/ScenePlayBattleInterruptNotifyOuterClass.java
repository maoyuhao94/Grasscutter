// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayBattleInterruptNotify.proto

public final class ScenePlayBattleInterruptNotifyOuterClass {
  private ScenePlayBattleInterruptNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayBattleInterruptNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayBattleInterruptNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 playType = 4;</code>
     * @return The playType.
     */
    int getPlayType();

    /**
     * <code>uint32 interruptState = 12;</code>
     * @return The interruptState.
     */
    int getInterruptState();

    /**
     * <code>uint32 playId = 14;</code>
     * @return The playId.
     */
    int getPlayId();
  }
  /**
   * Protobuf type {@code ScenePlayBattleInterruptNotify}
   */
  public static final class ScenePlayBattleInterruptNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayBattleInterruptNotify)
      ScenePlayBattleInterruptNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayBattleInterruptNotify.newBuilder() to construct.
    private ScenePlayBattleInterruptNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayBattleInterruptNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayBattleInterruptNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayBattleInterruptNotify(
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
            case 32: {

              playType_ = input.readUInt32();
              break;
            }
            case 96: {

              interruptState_ = input.readUInt32();
              break;
            }
            case 112: {

              playId_ = input.readUInt32();
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
      return ScenePlayBattleInterruptNotifyOuterClass.internal_static_ScenePlayBattleInterruptNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ScenePlayBattleInterruptNotifyOuterClass.internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.class, ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code ScenePlayBattleInterruptNotify.ECOKOFIAKGO}
     */
    public enum ECOKOFIAKGO
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4379;</code>
       */
      PEPPOHPHJOJ(1, 4379),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ECOKOFIAKGO DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4379;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4379;
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
      public static ECOKOFIAKGO valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ECOKOFIAKGO forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4379: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ECOKOFIAKGO>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ECOKOFIAKGO> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ECOKOFIAKGO>() {
              public ECOKOFIAKGO findValueByNumber(int number) {
                return ECOKOFIAKGO.forNumber(number);
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
        return ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final ECOKOFIAKGO[] VALUES = getStaticValuesArray();
      private static ECOKOFIAKGO[] getStaticValuesArray() {
        return new ECOKOFIAKGO[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static ECOKOFIAKGO valueOf(
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

      private ECOKOFIAKGO(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ScenePlayBattleInterruptNotify.ECOKOFIAKGO)
    }

    public static final int PLAYTYPE_FIELD_NUMBER = 4;
    private int playType_;
    /**
     * <code>uint32 playType = 4;</code>
     * @return The playType.
     */
    @java.lang.Override
    public int getPlayType() {
      return playType_;
    }

    public static final int INTERRUPTSTATE_FIELD_NUMBER = 12;
    private int interruptState_;
    /**
     * <code>uint32 interruptState = 12;</code>
     * @return The interruptState.
     */
    @java.lang.Override
    public int getInterruptState() {
      return interruptState_;
    }

    public static final int PLAYID_FIELD_NUMBER = 14;
    private int playId_;
    /**
     * <code>uint32 playId = 14;</code>
     * @return The playId.
     */
    @java.lang.Override
    public int getPlayId() {
      return playId_;
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
      if (playType_ != 0) {
        output.writeUInt32(4, playType_);
      }
      if (interruptState_ != 0) {
        output.writeUInt32(12, interruptState_);
      }
      if (playId_ != 0) {
        output.writeUInt32(14, playId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (playType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, playType_);
      }
      if (interruptState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, interruptState_);
      }
      if (playId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, playId_);
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
      if (!(obj instanceof ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify)) {
        return super.equals(obj);
      }
      ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify other = (ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify) obj;

      if (getPlayType()
          != other.getPlayType()) return false;
      if (getInterruptState()
          != other.getInterruptState()) return false;
      if (getPlayId()
          != other.getPlayId()) return false;
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
      hash = (37 * hash) + PLAYTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPlayType();
      hash = (37 * hash) + INTERRUPTSTATE_FIELD_NUMBER;
      hash = (53 * hash) + getInterruptState();
      hash = (37 * hash) + PLAYID_FIELD_NUMBER;
      hash = (53 * hash) + getPlayId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parseFrom(
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
    public static Builder newBuilder(ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify prototype) {
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
     * Protobuf type {@code ScenePlayBattleInterruptNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayBattleInterruptNotify)
        ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ScenePlayBattleInterruptNotifyOuterClass.internal_static_ScenePlayBattleInterruptNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ScenePlayBattleInterruptNotifyOuterClass.internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.class, ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.Builder.class);
      }

      // Construct using ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.newBuilder()
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
        playType_ = 0;

        interruptState_ = 0;

        playId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ScenePlayBattleInterruptNotifyOuterClass.internal_static_ScenePlayBattleInterruptNotify_descriptor;
      }

      @java.lang.Override
      public ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify getDefaultInstanceForType() {
        return ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.getDefaultInstance();
      }

      @java.lang.Override
      public ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify build() {
        ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify buildPartial() {
        ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify result = new ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify(this);
        result.playType_ = playType_;
        result.interruptState_ = interruptState_;
        result.playId_ = playId_;
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
        if (other instanceof ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify) {
          return mergeFrom((ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify other) {
        if (other == ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify.getDefaultInstance()) return this;
        if (other.getPlayType() != 0) {
          setPlayType(other.getPlayType());
        }
        if (other.getInterruptState() != 0) {
          setInterruptState(other.getInterruptState());
        }
        if (other.getPlayId() != 0) {
          setPlayId(other.getPlayId());
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
        ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playType_ ;
      /**
       * <code>uint32 playType = 4;</code>
       * @return The playType.
       */
      @java.lang.Override
      public int getPlayType() {
        return playType_;
      }
      /**
       * <code>uint32 playType = 4;</code>
       * @param value The playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(int value) {
        
        playType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playType = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
        
        playType_ = 0;
        onChanged();
        return this;
      }

      private int interruptState_ ;
      /**
       * <code>uint32 interruptState = 12;</code>
       * @return The interruptState.
       */
      @java.lang.Override
      public int getInterruptState() {
        return interruptState_;
      }
      /**
       * <code>uint32 interruptState = 12;</code>
       * @param value The interruptState to set.
       * @return This builder for chaining.
       */
      public Builder setInterruptState(int value) {
        
        interruptState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 interruptState = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearInterruptState() {
        
        interruptState_ = 0;
        onChanged();
        return this;
      }

      private int playId_ ;
      /**
       * <code>uint32 playId = 14;</code>
       * @return The playId.
       */
      @java.lang.Override
      public int getPlayId() {
        return playId_;
      }
      /**
       * <code>uint32 playId = 14;</code>
       * @param value The playId to set.
       * @return This builder for chaining.
       */
      public Builder setPlayId(int value) {
        
        playId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 playId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayId() {
        
        playId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayBattleInterruptNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayBattleInterruptNotify)
    private static final ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify();
    }

    public static ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayBattleInterruptNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayBattleInterruptNotify>() {
      @java.lang.Override
      public ScenePlayBattleInterruptNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayBattleInterruptNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayBattleInterruptNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayBattleInterruptNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ScenePlayBattleInterruptNotifyOuterClass.ScenePlayBattleInterruptNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayBattleInterruptNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ScenePlayBattleInterruptNotify.proto\"\253" +
      "\001\n\036ScenePlayBattleInterruptNotify\022\020\n\010pla" +
      "yType\030\004 \001(\r\022\026\n\016interruptState\030\014 \001(\r\022\016\n\006p" +
      "layId\030\016 \001(\r\"O\n\013ECOKOFIAKGO\022\010\n\004NONE\020\000\022\020\n\013" +
      "PEPPOHPHJOJ\020\233\"\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKO" +
      "LMPOEA\020\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ScenePlayBattleInterruptNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayBattleInterruptNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayBattleInterruptNotify_descriptor,
        new java.lang.String[] { "PlayType", "InterruptState", "PlayId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
