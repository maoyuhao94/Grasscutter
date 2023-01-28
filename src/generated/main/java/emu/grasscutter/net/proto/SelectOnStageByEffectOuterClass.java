// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectOnStageByEffect.proto

public final class SelectOnStageByEffectOuterClass {
  private SelectOnStageByEffectOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectOnStageByEffectOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SelectOnStageByEffect)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    int getSkillId();

    /**
     * <code>uint32 cardGuid = 2;</code>
     * @return The cardGuid.
     */
    int getCardGuid();

    /**
     * <code>uint32 controllerId = 13;</code>
     * @return The controllerId.
     */
    int getControllerId();
  }
  /**
   * Protobuf type {@code SelectOnStageByEffect}
   */
  public static final class SelectOnStageByEffect extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectOnStageByEffect)
      SelectOnStageByEffectOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectOnStageByEffect.newBuilder() to construct.
    private SelectOnStageByEffect(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectOnStageByEffect() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectOnStageByEffect();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SelectOnStageByEffect(
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
            case 16: {

              cardGuid_ = input.readUInt32();
              break;
            }
            case 32: {

              skillId_ = input.readUInt32();
              break;
            }
            case 104: {

              controllerId_ = input.readUInt32();
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
      return SelectOnStageByEffectOuterClass.internal_static_SelectOnStageByEffect_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SelectOnStageByEffectOuterClass.internal_static_SelectOnStageByEffect_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SelectOnStageByEffectOuterClass.SelectOnStageByEffect.class, SelectOnStageByEffectOuterClass.SelectOnStageByEffect.Builder.class);
    }

    public static final int SKILLID_FIELD_NUMBER = 4;
    private int skillId_;
    /**
     * <code>uint32 skillId = 4;</code>
     * @return The skillId.
     */
    @java.lang.Override
    public int getSkillId() {
      return skillId_;
    }

    public static final int CARDGUID_FIELD_NUMBER = 2;
    private int cardGuid_;
    /**
     * <code>uint32 cardGuid = 2;</code>
     * @return The cardGuid.
     */
    @java.lang.Override
    public int getCardGuid() {
      return cardGuid_;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 13;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 13;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
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
      if (cardGuid_ != 0) {
        output.writeUInt32(2, cardGuid_);
      }
      if (skillId_ != 0) {
        output.writeUInt32(4, skillId_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(13, controllerId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardGuid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cardGuid_);
      }
      if (skillId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, skillId_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, controllerId_);
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
      if (!(obj instanceof SelectOnStageByEffectOuterClass.SelectOnStageByEffect)) {
        return super.equals(obj);
      }
      SelectOnStageByEffectOuterClass.SelectOnStageByEffect other = (SelectOnStageByEffectOuterClass.SelectOnStageByEffect) obj;

      if (getSkillId()
          != other.getSkillId()) return false;
      if (getCardGuid()
          != other.getCardGuid()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
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
      hash = (37 * hash) + SKILLID_FIELD_NUMBER;
      hash = (53 * hash) + getSkillId();
      hash = (37 * hash) + CARDGUID_FIELD_NUMBER;
      hash = (53 * hash) + getCardGuid();
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect parseFrom(
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
    public static Builder newBuilder(SelectOnStageByEffectOuterClass.SelectOnStageByEffect prototype) {
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
     * Protobuf type {@code SelectOnStageByEffect}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectOnStageByEffect)
        SelectOnStageByEffectOuterClass.SelectOnStageByEffectOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SelectOnStageByEffectOuterClass.internal_static_SelectOnStageByEffect_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SelectOnStageByEffectOuterClass.internal_static_SelectOnStageByEffect_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SelectOnStageByEffectOuterClass.SelectOnStageByEffect.class, SelectOnStageByEffectOuterClass.SelectOnStageByEffect.Builder.class);
      }

      // Construct using SelectOnStageByEffectOuterClass.SelectOnStageByEffect.newBuilder()
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
        skillId_ = 0;

        cardGuid_ = 0;

        controllerId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SelectOnStageByEffectOuterClass.internal_static_SelectOnStageByEffect_descriptor;
      }

      @java.lang.Override
      public SelectOnStageByEffectOuterClass.SelectOnStageByEffect getDefaultInstanceForType() {
        return SelectOnStageByEffectOuterClass.SelectOnStageByEffect.getDefaultInstance();
      }

      @java.lang.Override
      public SelectOnStageByEffectOuterClass.SelectOnStageByEffect build() {
        SelectOnStageByEffectOuterClass.SelectOnStageByEffect result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SelectOnStageByEffectOuterClass.SelectOnStageByEffect buildPartial() {
        SelectOnStageByEffectOuterClass.SelectOnStageByEffect result = new SelectOnStageByEffectOuterClass.SelectOnStageByEffect(this);
        result.skillId_ = skillId_;
        result.cardGuid_ = cardGuid_;
        result.controllerId_ = controllerId_;
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
        if (other instanceof SelectOnStageByEffectOuterClass.SelectOnStageByEffect) {
          return mergeFrom((SelectOnStageByEffectOuterClass.SelectOnStageByEffect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SelectOnStageByEffectOuterClass.SelectOnStageByEffect other) {
        if (other == SelectOnStageByEffectOuterClass.SelectOnStageByEffect.getDefaultInstance()) return this;
        if (other.getSkillId() != 0) {
          setSkillId(other.getSkillId());
        }
        if (other.getCardGuid() != 0) {
          setCardGuid(other.getCardGuid());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
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
        SelectOnStageByEffectOuterClass.SelectOnStageByEffect parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SelectOnStageByEffectOuterClass.SelectOnStageByEffect) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int skillId_ ;
      /**
       * <code>uint32 skillId = 4;</code>
       * @return The skillId.
       */
      @java.lang.Override
      public int getSkillId() {
        return skillId_;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @param value The skillId to set.
       * @return This builder for chaining.
       */
      public Builder setSkillId(int value) {
        
        skillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 skillId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSkillId() {
        
        skillId_ = 0;
        onChanged();
        return this;
      }

      private int cardGuid_ ;
      /**
       * <code>uint32 cardGuid = 2;</code>
       * @return The cardGuid.
       */
      @java.lang.Override
      public int getCardGuid() {
        return cardGuid_;
      }
      /**
       * <code>uint32 cardGuid = 2;</code>
       * @param value The cardGuid to set.
       * @return This builder for chaining.
       */
      public Builder setCardGuid(int value) {
        
        cardGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cardGuid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardGuid() {
        
        cardGuid_ = 0;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 13;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 13;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SelectOnStageByEffect)
    }

    // @@protoc_insertion_point(class_scope:SelectOnStageByEffect)
    private static final SelectOnStageByEffectOuterClass.SelectOnStageByEffect DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SelectOnStageByEffectOuterClass.SelectOnStageByEffect();
    }

    public static SelectOnStageByEffectOuterClass.SelectOnStageByEffect getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectOnStageByEffect>
        PARSER = new com.google.protobuf.AbstractParser<SelectOnStageByEffect>() {
      @java.lang.Override
      public SelectOnStageByEffect parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SelectOnStageByEffect(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SelectOnStageByEffect> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectOnStageByEffect> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SelectOnStageByEffectOuterClass.SelectOnStageByEffect getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectOnStageByEffect_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectOnStageByEffect_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SelectOnStageByEffect.proto\"P\n\025SelectO" +
      "nStageByEffect\022\017\n\007skillId\030\004 \001(\r\022\020\n\010cardG" +
      "uid\030\002 \001(\r\022\024\n\014controllerId\030\r \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectOnStageByEffect_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SelectOnStageByEffect_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SelectOnStageByEffect_descriptor,
        new java.lang.String[] { "SkillId", "CardGuid", "ControllerId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
