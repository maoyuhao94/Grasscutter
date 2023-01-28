// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EMFJMDELOJN.proto

public final class EMFJMDELOJNOuterClass {
  private EMFJMDELOJNOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EMFJMDELOJNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EMFJMDELOJN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficulty = 7;</code>
     * @return The difficulty.
     */
    int getDifficulty();

    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>uint32 costTime = 6;</code>
     * @return The costTime.
     */
    int getCostTime();
  }
  /**
   * Protobuf type {@code EMFJMDELOJN}
   */
  public static final class EMFJMDELOJN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EMFJMDELOJN)
      EMFJMDELOJNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EMFJMDELOJN.newBuilder() to construct.
    private EMFJMDELOJN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EMFJMDELOJN() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EMFJMDELOJN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EMFJMDELOJN(
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
            case 8: {

              isOpen_ = input.readBool();
              break;
            }
            case 48: {

              costTime_ = input.readUInt32();
              break;
            }
            case 56: {

              difficulty_ = input.readUInt32();
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
      return EMFJMDELOJNOuterClass.internal_static_EMFJMDELOJN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EMFJMDELOJNOuterClass.internal_static_EMFJMDELOJN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EMFJMDELOJNOuterClass.EMFJMDELOJN.class, EMFJMDELOJNOuterClass.EMFJMDELOJN.Builder.class);
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 7;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 7;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
    }

    public static final int ISOPEN_FIELD_NUMBER = 1;
    private boolean isOpen_;
    /**
     * <code>bool isOpen = 1;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int COSTTIME_FIELD_NUMBER = 6;
    private int costTime_;
    /**
     * <code>uint32 costTime = 6;</code>
     * @return The costTime.
     */
    @java.lang.Override
    public int getCostTime() {
      return costTime_;
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
      if (isOpen_ != false) {
        output.writeBool(1, isOpen_);
      }
      if (costTime_ != 0) {
        output.writeUInt32(6, costTime_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(7, difficulty_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isOpen_);
      }
      if (costTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, costTime_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, difficulty_);
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
      if (!(obj instanceof EMFJMDELOJNOuterClass.EMFJMDELOJN)) {
        return super.equals(obj);
      }
      EMFJMDELOJNOuterClass.EMFJMDELOJN other = (EMFJMDELOJNOuterClass.EMFJMDELOJN) obj;

      if (getDifficulty()
          != other.getDifficulty()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getCostTime()
          != other.getCostTime()) return false;
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
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (37 * hash) + ISOPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + COSTTIME_FIELD_NUMBER;
      hash = (53 * hash) + getCostTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EMFJMDELOJNOuterClass.EMFJMDELOJN parseFrom(
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
    public static Builder newBuilder(EMFJMDELOJNOuterClass.EMFJMDELOJN prototype) {
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
     * Protobuf type {@code EMFJMDELOJN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EMFJMDELOJN)
        EMFJMDELOJNOuterClass.EMFJMDELOJNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EMFJMDELOJNOuterClass.internal_static_EMFJMDELOJN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EMFJMDELOJNOuterClass.internal_static_EMFJMDELOJN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EMFJMDELOJNOuterClass.EMFJMDELOJN.class, EMFJMDELOJNOuterClass.EMFJMDELOJN.Builder.class);
      }

      // Construct using EMFJMDELOJNOuterClass.EMFJMDELOJN.newBuilder()
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
        difficulty_ = 0;

        isOpen_ = false;

        costTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EMFJMDELOJNOuterClass.internal_static_EMFJMDELOJN_descriptor;
      }

      @java.lang.Override
      public EMFJMDELOJNOuterClass.EMFJMDELOJN getDefaultInstanceForType() {
        return EMFJMDELOJNOuterClass.EMFJMDELOJN.getDefaultInstance();
      }

      @java.lang.Override
      public EMFJMDELOJNOuterClass.EMFJMDELOJN build() {
        EMFJMDELOJNOuterClass.EMFJMDELOJN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EMFJMDELOJNOuterClass.EMFJMDELOJN buildPartial() {
        EMFJMDELOJNOuterClass.EMFJMDELOJN result = new EMFJMDELOJNOuterClass.EMFJMDELOJN(this);
        result.difficulty_ = difficulty_;
        result.isOpen_ = isOpen_;
        result.costTime_ = costTime_;
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
        if (other instanceof EMFJMDELOJNOuterClass.EMFJMDELOJN) {
          return mergeFrom((EMFJMDELOJNOuterClass.EMFJMDELOJN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EMFJMDELOJNOuterClass.EMFJMDELOJN other) {
        if (other == EMFJMDELOJNOuterClass.EMFJMDELOJN.getDefaultInstance()) return this;
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getCostTime() != 0) {
          setCostTime(other.getCostTime());
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
        EMFJMDELOJNOuterClass.EMFJMDELOJN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EMFJMDELOJNOuterClass.EMFJMDELOJN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 7;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 7;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool isOpen = 1;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isOpen = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private int costTime_ ;
      /**
       * <code>uint32 costTime = 6;</code>
       * @return The costTime.
       */
      @java.lang.Override
      public int getCostTime() {
        return costTime_;
      }
      /**
       * <code>uint32 costTime = 6;</code>
       * @param value The costTime to set.
       * @return This builder for chaining.
       */
      public Builder setCostTime(int value) {
        
        costTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 costTime = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCostTime() {
        
        costTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EMFJMDELOJN)
    }

    // @@protoc_insertion_point(class_scope:EMFJMDELOJN)
    private static final EMFJMDELOJNOuterClass.EMFJMDELOJN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EMFJMDELOJNOuterClass.EMFJMDELOJN();
    }

    public static EMFJMDELOJNOuterClass.EMFJMDELOJN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EMFJMDELOJN>
        PARSER = new com.google.protobuf.AbstractParser<EMFJMDELOJN>() {
      @java.lang.Override
      public EMFJMDELOJN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EMFJMDELOJN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EMFJMDELOJN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EMFJMDELOJN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EMFJMDELOJNOuterClass.EMFJMDELOJN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EMFJMDELOJN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EMFJMDELOJN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EMFJMDELOJN.proto\"C\n\013EMFJMDELOJN\022\022\n\ndi" +
      "fficulty\030\007 \001(\r\022\016\n\006isOpen\030\001 \001(\010\022\020\n\010costTi" +
      "me\030\006 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EMFJMDELOJN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EMFJMDELOJN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EMFJMDELOJN_descriptor,
        new java.lang.String[] { "Difficulty", "IsOpen", "CostTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
