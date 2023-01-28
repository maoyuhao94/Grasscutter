// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MistTrialFloorLevelNotify.proto

public final class MistTrialFloorLevelNotifyOuterClass {
  private MistTrialFloorLevelNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MistTrialFloorLevelNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MistTrialFloorLevelNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeonSceneId = 9;</code>
     * @return The dungeonSceneId.
     */
    int getDungeonSceneId();

    /**
     * <code>uint32 floorLevel = 11;</code>
     * @return The floorLevel.
     */
    int getFloorLevel();
  }
  /**
   * Protobuf type {@code MistTrialFloorLevelNotify}
   */
  public static final class MistTrialFloorLevelNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MistTrialFloorLevelNotify)
      MistTrialFloorLevelNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MistTrialFloorLevelNotify.newBuilder() to construct.
    private MistTrialFloorLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MistTrialFloorLevelNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MistTrialFloorLevelNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MistTrialFloorLevelNotify(
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
            case 72: {

              dungeonSceneId_ = input.readUInt32();
              break;
            }
            case 88: {

              floorLevel_ = input.readUInt32();
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
      return MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.class, MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code MistTrialFloorLevelNotify.BALAKBNIDBK}
     */
    public enum BALAKBNIDBK
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 911;</code>
       */
      PEPPOHPHJOJ(1, 911),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BALAKBNIDBK DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final BALAKBNIDBK EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 911;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 911;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static BALAKBNIDBK valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BALAKBNIDBK forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 911: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BALAKBNIDBK>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BALAKBNIDBK> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BALAKBNIDBK>() {
              public BALAKBNIDBK findValueByNumber(int number) {
                return BALAKBNIDBK.forNumber(number);
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
        return MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final BALAKBNIDBK[] VALUES = getStaticValuesArray();
      private static BALAKBNIDBK[] getStaticValuesArray() {
        return new BALAKBNIDBK[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static BALAKBNIDBK valueOf(
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

      private BALAKBNIDBK(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:MistTrialFloorLevelNotify.BALAKBNIDBK)
    }

    public static final int DUNGEONSCENEID_FIELD_NUMBER = 9;
    private int dungeonSceneId_;
    /**
     * <code>uint32 dungeonSceneId = 9;</code>
     * @return The dungeonSceneId.
     */
    @java.lang.Override
    public int getDungeonSceneId() {
      return dungeonSceneId_;
    }

    public static final int FLOORLEVEL_FIELD_NUMBER = 11;
    private int floorLevel_;
    /**
     * <code>uint32 floorLevel = 11;</code>
     * @return The floorLevel.
     */
    @java.lang.Override
    public int getFloorLevel() {
      return floorLevel_;
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
      if (dungeonSceneId_ != 0) {
        output.writeUInt32(9, dungeonSceneId_);
      }
      if (floorLevel_ != 0) {
        output.writeUInt32(11, floorLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonSceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, dungeonSceneId_);
      }
      if (floorLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, floorLevel_);
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
      if (!(obj instanceof MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify)) {
        return super.equals(obj);
      }
      MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other = (MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) obj;

      if (getDungeonSceneId()
          != other.getDungeonSceneId()) return false;
      if (getFloorLevel()
          != other.getFloorLevel()) return false;
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
      hash = (37 * hash) + DUNGEONSCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonSceneId();
      hash = (37 * hash) + FLOORLEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getFloorLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parseFrom(
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
    public static Builder newBuilder(MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify prototype) {
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
     * Protobuf type {@code MistTrialFloorLevelNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MistTrialFloorLevelNotify)
        MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.class, MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.Builder.class);
      }

      // Construct using MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.newBuilder()
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
        dungeonSceneId_ = 0;

        floorLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return MistTrialFloorLevelNotifyOuterClass.internal_static_MistTrialFloorLevelNotify_descriptor;
      }

      @java.lang.Override
      public MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
        return MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDefaultInstance();
      }

      @java.lang.Override
      public MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify build() {
        MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify buildPartial() {
        MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify result = new MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify(this);
        result.dungeonSceneId_ = dungeonSceneId_;
        result.floorLevel_ = floorLevel_;
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
        if (other instanceof MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) {
          return mergeFrom((MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify other) {
        if (other == MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify.getDefaultInstance()) return this;
        if (other.getDungeonSceneId() != 0) {
          setDungeonSceneId(other.getDungeonSceneId());
        }
        if (other.getFloorLevel() != 0) {
          setFloorLevel(other.getFloorLevel());
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
        MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int dungeonSceneId_ ;
      /**
       * <code>uint32 dungeonSceneId = 9;</code>
       * @return The dungeonSceneId.
       */
      @java.lang.Override
      public int getDungeonSceneId() {
        return dungeonSceneId_;
      }
      /**
       * <code>uint32 dungeonSceneId = 9;</code>
       * @param value The dungeonSceneId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonSceneId(int value) {
        
        dungeonSceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonSceneId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonSceneId() {
        
        dungeonSceneId_ = 0;
        onChanged();
        return this;
      }

      private int floorLevel_ ;
      /**
       * <code>uint32 floorLevel = 11;</code>
       * @return The floorLevel.
       */
      @java.lang.Override
      public int getFloorLevel() {
        return floorLevel_;
      }
      /**
       * <code>uint32 floorLevel = 11;</code>
       * @param value The floorLevel to set.
       * @return This builder for chaining.
       */
      public Builder setFloorLevel(int value) {
        
        floorLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 floorLevel = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearFloorLevel() {
        
        floorLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MistTrialFloorLevelNotify)
    }

    // @@protoc_insertion_point(class_scope:MistTrialFloorLevelNotify)
    private static final MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify();
    }

    public static MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MistTrialFloorLevelNotify>
        PARSER = new com.google.protobuf.AbstractParser<MistTrialFloorLevelNotify>() {
      @java.lang.Override
      public MistTrialFloorLevelNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MistTrialFloorLevelNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MistTrialFloorLevelNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MistTrialFloorLevelNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public MistTrialFloorLevelNotifyOuterClass.MistTrialFloorLevelNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MistTrialFloorLevelNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MistTrialFloorLevelNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MistTrialFloorLevelNotify.proto\"\251\001\n\031Mi" +
      "stTrialFloorLevelNotify\022\026\n\016dungeonSceneI" +
      "d\030\t \001(\r\022\022\n\nfloorLevel\030\013 \001(\r\"`\n\013BALAKBNID" +
      "BK\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\217\007\022\017\n\013DCDNIL" +
      "FDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020" +
      "\001\032\002\020\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MistTrialFloorLevelNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MistTrialFloorLevelNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MistTrialFloorLevelNotify_descriptor,
        new java.lang.String[] { "DungeonSceneId", "FloorLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
