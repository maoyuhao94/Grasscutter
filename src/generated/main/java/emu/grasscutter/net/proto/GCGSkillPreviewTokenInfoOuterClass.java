// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGSkillPreviewTokenInfo.proto

public final class GCGSkillPreviewTokenInfoOuterClass {
  private GCGSkillPreviewTokenInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGSkillPreviewTokenInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGSkillPreviewTokenInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_MMIKPPJMHAD = 7;</code>
     * @return The unk3300MMIKPPJMHAD.
     */
    int getUnk3300MMIKPPJMHAD();

    /**
     * <code>uint32 Unk3300_IKICJMEFEON = 6;</code>
     * @return The unk3300IKICJMEFEON.
     */
    int getUnk3300IKICJMEFEON();

    /**
     * <code>uint32 tokenType = 8;</code>
     * @return The tokenType.
     */
    int getTokenType();
  }
  /**
   * Protobuf type {@code GCGSkillPreviewTokenInfo}
   */
  public static final class GCGSkillPreviewTokenInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGSkillPreviewTokenInfo)
      GCGSkillPreviewTokenInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGSkillPreviewTokenInfo.newBuilder() to construct.
    private GCGSkillPreviewTokenInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGSkillPreviewTokenInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGSkillPreviewTokenInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGSkillPreviewTokenInfo(
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
            case 48: {

              unk3300IKICJMEFEON_ = input.readUInt32();
              break;
            }
            case 56: {

              unk3300MMIKPPJMHAD_ = input.readUInt32();
              break;
            }
            case 64: {

              tokenType_ = input.readUInt32();
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
      return GCGSkillPreviewTokenInfoOuterClass.internal_static_GCGSkillPreviewTokenInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GCGSkillPreviewTokenInfoOuterClass.internal_static_GCGSkillPreviewTokenInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.class, GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.Builder.class);
    }

    public static final int UNK3300_MMIKPPJMHAD_FIELD_NUMBER = 7;
    private int unk3300MMIKPPJMHAD_;
    /**
     * <code>uint32 Unk3300_MMIKPPJMHAD = 7;</code>
     * @return The unk3300MMIKPPJMHAD.
     */
    @java.lang.Override
    public int getUnk3300MMIKPPJMHAD() {
      return unk3300MMIKPPJMHAD_;
    }

    public static final int UNK3300_IKICJMEFEON_FIELD_NUMBER = 6;
    private int unk3300IKICJMEFEON_;
    /**
     * <code>uint32 Unk3300_IKICJMEFEON = 6;</code>
     * @return The unk3300IKICJMEFEON.
     */
    @java.lang.Override
    public int getUnk3300IKICJMEFEON() {
      return unk3300IKICJMEFEON_;
    }

    public static final int TOKENTYPE_FIELD_NUMBER = 8;
    private int tokenType_;
    /**
     * <code>uint32 tokenType = 8;</code>
     * @return The tokenType.
     */
    @java.lang.Override
    public int getTokenType() {
      return tokenType_;
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
      if (unk3300IKICJMEFEON_ != 0) {
        output.writeUInt32(6, unk3300IKICJMEFEON_);
      }
      if (unk3300MMIKPPJMHAD_ != 0) {
        output.writeUInt32(7, unk3300MMIKPPJMHAD_);
      }
      if (tokenType_ != 0) {
        output.writeUInt32(8, tokenType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk3300IKICJMEFEON_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, unk3300IKICJMEFEON_);
      }
      if (unk3300MMIKPPJMHAD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, unk3300MMIKPPJMHAD_);
      }
      if (tokenType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, tokenType_);
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
      if (!(obj instanceof GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo)) {
        return super.equals(obj);
      }
      GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo other = (GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo) obj;

      if (getUnk3300MMIKPPJMHAD()
          != other.getUnk3300MMIKPPJMHAD()) return false;
      if (getUnk3300IKICJMEFEON()
          != other.getUnk3300IKICJMEFEON()) return false;
      if (getTokenType()
          != other.getTokenType()) return false;
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
      hash = (37 * hash) + UNK3300_MMIKPPJMHAD_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300MMIKPPJMHAD();
      hash = (37 * hash) + UNK3300_IKICJMEFEON_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300IKICJMEFEON();
      hash = (37 * hash) + TOKENTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getTokenType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parseFrom(
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
    public static Builder newBuilder(GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo prototype) {
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
     * Protobuf type {@code GCGSkillPreviewTokenInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGSkillPreviewTokenInfo)
        GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GCGSkillPreviewTokenInfoOuterClass.internal_static_GCGSkillPreviewTokenInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GCGSkillPreviewTokenInfoOuterClass.internal_static_GCGSkillPreviewTokenInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.class, GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.Builder.class);
      }

      // Construct using GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.newBuilder()
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
        unk3300MMIKPPJMHAD_ = 0;

        unk3300IKICJMEFEON_ = 0;

        tokenType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GCGSkillPreviewTokenInfoOuterClass.internal_static_GCGSkillPreviewTokenInfo_descriptor;
      }

      @java.lang.Override
      public GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo getDefaultInstanceForType() {
        return GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.getDefaultInstance();
      }

      @java.lang.Override
      public GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo build() {
        GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo buildPartial() {
        GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo result = new GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo(this);
        result.unk3300MMIKPPJMHAD_ = unk3300MMIKPPJMHAD_;
        result.unk3300IKICJMEFEON_ = unk3300IKICJMEFEON_;
        result.tokenType_ = tokenType_;
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
        if (other instanceof GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo) {
          return mergeFrom((GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo other) {
        if (other == GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo.getDefaultInstance()) return this;
        if (other.getUnk3300MMIKPPJMHAD() != 0) {
          setUnk3300MMIKPPJMHAD(other.getUnk3300MMIKPPJMHAD());
        }
        if (other.getUnk3300IKICJMEFEON() != 0) {
          setUnk3300IKICJMEFEON(other.getUnk3300IKICJMEFEON());
        }
        if (other.getTokenType() != 0) {
          setTokenType(other.getTokenType());
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
        GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300MMIKPPJMHAD_ ;
      /**
       * <code>uint32 Unk3300_MMIKPPJMHAD = 7;</code>
       * @return The unk3300MMIKPPJMHAD.
       */
      @java.lang.Override
      public int getUnk3300MMIKPPJMHAD() {
        return unk3300MMIKPPJMHAD_;
      }
      /**
       * <code>uint32 Unk3300_MMIKPPJMHAD = 7;</code>
       * @param value The unk3300MMIKPPJMHAD to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300MMIKPPJMHAD(int value) {
        
        unk3300MMIKPPJMHAD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_MMIKPPJMHAD = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300MMIKPPJMHAD() {
        
        unk3300MMIKPPJMHAD_ = 0;
        onChanged();
        return this;
      }

      private int unk3300IKICJMEFEON_ ;
      /**
       * <code>uint32 Unk3300_IKICJMEFEON = 6;</code>
       * @return The unk3300IKICJMEFEON.
       */
      @java.lang.Override
      public int getUnk3300IKICJMEFEON() {
        return unk3300IKICJMEFEON_;
      }
      /**
       * <code>uint32 Unk3300_IKICJMEFEON = 6;</code>
       * @param value The unk3300IKICJMEFEON to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300IKICJMEFEON(int value) {
        
        unk3300IKICJMEFEON_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_IKICJMEFEON = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300IKICJMEFEON() {
        
        unk3300IKICJMEFEON_ = 0;
        onChanged();
        return this;
      }

      private int tokenType_ ;
      /**
       * <code>uint32 tokenType = 8;</code>
       * @return The tokenType.
       */
      @java.lang.Override
      public int getTokenType() {
        return tokenType_;
      }
      /**
       * <code>uint32 tokenType = 8;</code>
       * @param value The tokenType to set.
       * @return This builder for chaining.
       */
      public Builder setTokenType(int value) {
        
        tokenType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tokenType = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTokenType() {
        
        tokenType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGSkillPreviewTokenInfo)
    }

    // @@protoc_insertion_point(class_scope:GCGSkillPreviewTokenInfo)
    private static final GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo();
    }

    public static GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGSkillPreviewTokenInfo>
        PARSER = new com.google.protobuf.AbstractParser<GCGSkillPreviewTokenInfo>() {
      @java.lang.Override
      public GCGSkillPreviewTokenInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGSkillPreviewTokenInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGSkillPreviewTokenInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGSkillPreviewTokenInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public GCGSkillPreviewTokenInfoOuterClass.GCGSkillPreviewTokenInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGSkillPreviewTokenInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGSkillPreviewTokenInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GCGSkillPreviewTokenInfo.proto\"g\n\030GCGS" +
      "killPreviewTokenInfo\022\033\n\023Unk3300_MMIKPPJM" +
      "HAD\030\007 \001(\r\022\033\n\023Unk3300_IKICJMEFEON\030\006 \001(\r\022\021" +
      "\n\ttokenType\030\010 \001(\rb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGSkillPreviewTokenInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGSkillPreviewTokenInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGSkillPreviewTokenInfo_descriptor,
        new java.lang.String[] { "Unk3300MMIKPPJMHAD", "Unk3300IKICJMEFEON", "TokenType", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
