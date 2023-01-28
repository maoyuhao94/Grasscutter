// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OpTimer.proto

public final class OpTimerOuterClass {
  private OpTimerOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OpTimerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpTimer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 timeStamp = 9;</code>
     * @return The timeStamp.
     */
    long getTimeStamp();

    /**
     * <code>uint64 beginTime = 10;</code>
     * @return The beginTime.
     */
    long getBeginTime();

    /**
     * <code>uint32 controllerId = 6;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>.GCGPhaseType phase = 1;</code>
     * @return The enum numeric value on the wire for phase.
     */
    int getPhaseValue();
    /**
     * <code>.GCGPhaseType phase = 1;</code>
     * @return The phase.
     */
    GCGPhaseTypeOuterClass.GCGPhaseType getPhase();
  }
  /**
   * Protobuf type {@code OpTimer}
   */
  public static final class OpTimer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OpTimer)
      OpTimerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OpTimer.newBuilder() to construct.
    private OpTimer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OpTimer() {
      phase_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OpTimer();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OpTimer(
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
              int rawValue = input.readEnum();

              phase_ = rawValue;
              break;
            }
            case 48: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 72: {

              timeStamp_ = input.readUInt64();
              break;
            }
            case 80: {

              beginTime_ = input.readUInt64();
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
      return OpTimerOuterClass.internal_static_OpTimer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return OpTimerOuterClass.internal_static_OpTimer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              OpTimerOuterClass.OpTimer.class, OpTimerOuterClass.OpTimer.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 9;
    private long timeStamp_;
    /**
     * <code>uint64 timeStamp = 9;</code>
     * @return The timeStamp.
     */
    @java.lang.Override
    public long getTimeStamp() {
      return timeStamp_;
    }

    public static final int BEGINTIME_FIELD_NUMBER = 10;
    private long beginTime_;
    /**
     * <code>uint64 beginTime = 10;</code>
     * @return The beginTime.
     */
    @java.lang.Override
    public long getBeginTime() {
      return beginTime_;
    }

    public static final int CONTROLLERID_FIELD_NUMBER = 6;
    private int controllerId_;
    /**
     * <code>uint32 controllerId = 6;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int PHASE_FIELD_NUMBER = 1;
    private int phase_;
    /**
     * <code>.GCGPhaseType phase = 1;</code>
     * @return The enum numeric value on the wire for phase.
     */
    @java.lang.Override public int getPhaseValue() {
      return phase_;
    }
    /**
     * <code>.GCGPhaseType phase = 1;</code>
     * @return The phase.
     */
    @java.lang.Override public GCGPhaseTypeOuterClass.GCGPhaseType getPhase() {
      @SuppressWarnings("deprecation")
      GCGPhaseTypeOuterClass.GCGPhaseType result = GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phase_);
      return result == null ? GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
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
      if (phase_ != GCGPhaseTypeOuterClass.GCGPhaseType.GCG_PHASE_TYPE_INVALID.getNumber()) {
        output.writeEnum(1, phase_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(6, controllerId_);
      }
      if (timeStamp_ != 0L) {
        output.writeUInt64(9, timeStamp_);
      }
      if (beginTime_ != 0L) {
        output.writeUInt64(10, beginTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (phase_ != GCGPhaseTypeOuterClass.GCGPhaseType.GCG_PHASE_TYPE_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, phase_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, controllerId_);
      }
      if (timeStamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(9, timeStamp_);
      }
      if (beginTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(10, beginTime_);
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
      if (!(obj instanceof OpTimerOuterClass.OpTimer)) {
        return super.equals(obj);
      }
      OpTimerOuterClass.OpTimer other = (OpTimerOuterClass.OpTimer) obj;

      if (getTimeStamp()
          != other.getTimeStamp()) return false;
      if (getBeginTime()
          != other.getBeginTime()) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (phase_ != other.phase_) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimeStamp());
      hash = (37 * hash) + BEGINTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getBeginTime());
      hash = (37 * hash) + CONTROLLERID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + PHASE_FIELD_NUMBER;
      hash = (53 * hash) + phase_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static OpTimerOuterClass.OpTimer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static OpTimerOuterClass.OpTimer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static OpTimerOuterClass.OpTimer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static OpTimerOuterClass.OpTimer parseFrom(
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
    public static Builder newBuilder(OpTimerOuterClass.OpTimer prototype) {
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
     * Protobuf type {@code OpTimer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpTimer)
        OpTimerOuterClass.OpTimerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return OpTimerOuterClass.internal_static_OpTimer_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return OpTimerOuterClass.internal_static_OpTimer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                OpTimerOuterClass.OpTimer.class, OpTimerOuterClass.OpTimer.Builder.class);
      }

      // Construct using OpTimerOuterClass.OpTimer.newBuilder()
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
        timeStamp_ = 0L;

        beginTime_ = 0L;

        controllerId_ = 0;

        phase_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return OpTimerOuterClass.internal_static_OpTimer_descriptor;
      }

      @java.lang.Override
      public OpTimerOuterClass.OpTimer getDefaultInstanceForType() {
        return OpTimerOuterClass.OpTimer.getDefaultInstance();
      }

      @java.lang.Override
      public OpTimerOuterClass.OpTimer build() {
        OpTimerOuterClass.OpTimer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public OpTimerOuterClass.OpTimer buildPartial() {
        OpTimerOuterClass.OpTimer result = new OpTimerOuterClass.OpTimer(this);
        result.timeStamp_ = timeStamp_;
        result.beginTime_ = beginTime_;
        result.controllerId_ = controllerId_;
        result.phase_ = phase_;
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
        if (other instanceof OpTimerOuterClass.OpTimer) {
          return mergeFrom((OpTimerOuterClass.OpTimer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(OpTimerOuterClass.OpTimer other) {
        if (other == OpTimerOuterClass.OpTimer.getDefaultInstance()) return this;
        if (other.getTimeStamp() != 0L) {
          setTimeStamp(other.getTimeStamp());
        }
        if (other.getBeginTime() != 0L) {
          setBeginTime(other.getBeginTime());
        }
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.phase_ != 0) {
          setPhaseValue(other.getPhaseValue());
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
        OpTimerOuterClass.OpTimer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (OpTimerOuterClass.OpTimer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long timeStamp_ ;
      /**
       * <code>uint64 timeStamp = 9;</code>
       * @return The timeStamp.
       */
      @java.lang.Override
      public long getTimeStamp() {
        return timeStamp_;
      }
      /**
       * <code>uint64 timeStamp = 9;</code>
       * @param value The timeStamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimeStamp(long value) {
        
        timeStamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 timeStamp = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimeStamp() {
        
        timeStamp_ = 0L;
        onChanged();
        return this;
      }

      private long beginTime_ ;
      /**
       * <code>uint64 beginTime = 10;</code>
       * @return The beginTime.
       */
      @java.lang.Override
      public long getBeginTime() {
        return beginTime_;
      }
      /**
       * <code>uint64 beginTime = 10;</code>
       * @param value The beginTime to set.
       * @return This builder for chaining.
       */
      public Builder setBeginTime(long value) {
        
        beginTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 beginTime = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBeginTime() {
        
        beginTime_ = 0L;
        onChanged();
        return this;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controllerId = 6;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controllerId = 6;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controllerId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int phase_ = 0;
      /**
       * <code>.GCGPhaseType phase = 1;</code>
       * @return The enum numeric value on the wire for phase.
       */
      @java.lang.Override public int getPhaseValue() {
        return phase_;
      }
      /**
       * <code>.GCGPhaseType phase = 1;</code>
       * @param value The enum numeric value on the wire for phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhaseValue(int value) {
        
        phase_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase = 1;</code>
       * @return The phase.
       */
      @java.lang.Override
      public GCGPhaseTypeOuterClass.GCGPhaseType getPhase() {
        @SuppressWarnings("deprecation")
        GCGPhaseTypeOuterClass.GCGPhaseType result = GCGPhaseTypeOuterClass.GCGPhaseType.valueOf(phase_);
        return result == null ? GCGPhaseTypeOuterClass.GCGPhaseType.UNRECOGNIZED : result;
      }
      /**
       * <code>.GCGPhaseType phase = 1;</code>
       * @param value The phase to set.
       * @return This builder for chaining.
       */
      public Builder setPhase(GCGPhaseTypeOuterClass.GCGPhaseType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        phase_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GCGPhaseType phase = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPhase() {
        
        phase_ = 0;
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


      // @@protoc_insertion_point(builder_scope:OpTimer)
    }

    // @@protoc_insertion_point(class_scope:OpTimer)
    private static final OpTimerOuterClass.OpTimer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new OpTimerOuterClass.OpTimer();
    }

    public static OpTimerOuterClass.OpTimer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OpTimer>
        PARSER = new com.google.protobuf.AbstractParser<OpTimer>() {
      @java.lang.Override
      public OpTimer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpTimer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OpTimer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OpTimer> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public OpTimerOuterClass.OpTimer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpTimer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OpTimer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rOpTimer.proto\032\022GCGPhaseType.proto\"c\n\007O" +
      "pTimer\022\021\n\ttimeStamp\030\t \001(\004\022\021\n\tbeginTime\030\n" +
      " \001(\004\022\024\n\014controllerId\030\006 \001(\r\022\034\n\005phase\030\001 \001(" +
      "\0162\r.GCGPhaseTypeb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          GCGPhaseTypeOuterClass.getDescriptor(),
        });
    internal_static_OpTimer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpTimer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OpTimer_descriptor,
        new java.lang.String[] { "TimeStamp", "BeginTime", "ControllerId", "Phase", });
    GCGPhaseTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
