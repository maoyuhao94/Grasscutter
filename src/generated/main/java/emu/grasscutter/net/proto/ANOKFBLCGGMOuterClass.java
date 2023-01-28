// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ANOKFBLCGGM.proto

public final class ANOKFBLCGGMOuterClass {
  private ANOKFBLCGGMOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ANOKFBLCGGMOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ANOKFBLCGGM)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 moduleId = 1;</code>
     * @return The moduleId.
     */
    int getModuleId();

    /**
     * <code>uint32 sceneId = 2;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool hoogfkfbckk = 3;</code>
     * @return The hoogfkfbckk.
     */
    boolean getHoogfkfbckk();

    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF> 
        getLpjicbgaldoList();
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    PDOPJIGDNPFOuterClass.PDOPJIGDNPF getLpjicbgaldo(int index);
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    int getLpjicbgaldoCount();
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    java.util.List<? extends PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder> 
        getLpjicbgaldoOrBuilderList();
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder getLpjicbgaldoOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ANOKFBLCGGM}
   */
  public static final class ANOKFBLCGGM extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ANOKFBLCGGM)
      ANOKFBLCGGMOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ANOKFBLCGGM.newBuilder() to construct.
    private ANOKFBLCGGM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ANOKFBLCGGM() {
      lpjicbgaldo_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ANOKFBLCGGM();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ANOKFBLCGGM(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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

              moduleId_ = input.readUInt32();
              break;
            }
            case 16: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 24: {

              hoogfkfbckk_ = input.readBool();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                lpjicbgaldo_ = new java.util.ArrayList<PDOPJIGDNPFOuterClass.PDOPJIGDNPF>();
                mutable_bitField0_ |= 0x00000001;
              }
              lpjicbgaldo_.add(
                  input.readMessage(PDOPJIGDNPFOuterClass.PDOPJIGDNPF.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          lpjicbgaldo_ = java.util.Collections.unmodifiableList(lpjicbgaldo_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ANOKFBLCGGMOuterClass.internal_static_ANOKFBLCGGM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ANOKFBLCGGMOuterClass.internal_static_ANOKFBLCGGM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ANOKFBLCGGMOuterClass.ANOKFBLCGGM.class, ANOKFBLCGGMOuterClass.ANOKFBLCGGM.Builder.class);
    }

    public static final int MODULEID_FIELD_NUMBER = 1;
    private int moduleId_;
    /**
     * <code>uint32 moduleId = 1;</code>
     * @return The moduleId.
     */
    @java.lang.Override
    public int getModuleId() {
      return moduleId_;
    }

    public static final int SCENEID_FIELD_NUMBER = 2;
    private int sceneId_;
    /**
     * <code>uint32 sceneId = 2;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int HOOGFKFBCKK_FIELD_NUMBER = 3;
    private boolean hoogfkfbckk_;
    /**
     * <code>bool hoogfkfbckk = 3;</code>
     * @return The hoogfkfbckk.
     */
    @java.lang.Override
    public boolean getHoogfkfbckk() {
      return hoogfkfbckk_;
    }

    public static final int LPJICBGALDO_FIELD_NUMBER = 4;
    private java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF> lpjicbgaldo_;
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    @java.lang.Override
    public java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF> getLpjicbgaldoList() {
      return lpjicbgaldo_;
    }
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder> 
        getLpjicbgaldoOrBuilderList() {
      return lpjicbgaldo_;
    }
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    @java.lang.Override
    public int getLpjicbgaldoCount() {
      return lpjicbgaldo_.size();
    }
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    @java.lang.Override
    public PDOPJIGDNPFOuterClass.PDOPJIGDNPF getLpjicbgaldo(int index) {
      return lpjicbgaldo_.get(index);
    }
    /**
     * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
     */
    @java.lang.Override
    public PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder getLpjicbgaldoOrBuilder(
        int index) {
      return lpjicbgaldo_.get(index);
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
      if (moduleId_ != 0) {
        output.writeUInt32(1, moduleId_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(2, sceneId_);
      }
      if (hoogfkfbckk_ != false) {
        output.writeBool(3, hoogfkfbckk_);
      }
      for (int i = 0; i < lpjicbgaldo_.size(); i++) {
        output.writeMessage(4, lpjicbgaldo_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (moduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, moduleId_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, sceneId_);
      }
      if (hoogfkfbckk_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, hoogfkfbckk_);
      }
      for (int i = 0; i < lpjicbgaldo_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, lpjicbgaldo_.get(i));
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
      if (!(obj instanceof ANOKFBLCGGMOuterClass.ANOKFBLCGGM)) {
        return super.equals(obj);
      }
      ANOKFBLCGGMOuterClass.ANOKFBLCGGM other = (ANOKFBLCGGMOuterClass.ANOKFBLCGGM) obj;

      if (getModuleId()
          != other.getModuleId()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
      if (getHoogfkfbckk()
          != other.getHoogfkfbckk()) return false;
      if (!getLpjicbgaldoList()
          .equals(other.getLpjicbgaldoList())) return false;
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
      hash = (37 * hash) + MODULEID_FIELD_NUMBER;
      hash = (53 * hash) + getModuleId();
      hash = (37 * hash) + SCENEID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + HOOGFKFBCKK_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHoogfkfbckk());
      if (getLpjicbgaldoCount() > 0) {
        hash = (37 * hash) + LPJICBGALDO_FIELD_NUMBER;
        hash = (53 * hash) + getLpjicbgaldoList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM parseFrom(
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
    public static Builder newBuilder(ANOKFBLCGGMOuterClass.ANOKFBLCGGM prototype) {
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
     * Protobuf type {@code ANOKFBLCGGM}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ANOKFBLCGGM)
        ANOKFBLCGGMOuterClass.ANOKFBLCGGMOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ANOKFBLCGGMOuterClass.internal_static_ANOKFBLCGGM_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ANOKFBLCGGMOuterClass.internal_static_ANOKFBLCGGM_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ANOKFBLCGGMOuterClass.ANOKFBLCGGM.class, ANOKFBLCGGMOuterClass.ANOKFBLCGGM.Builder.class);
      }

      // Construct using ANOKFBLCGGMOuterClass.ANOKFBLCGGM.newBuilder()
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
          getLpjicbgaldoFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        moduleId_ = 0;

        sceneId_ = 0;

        hoogfkfbckk_ = false;

        if (lpjicbgaldoBuilder_ == null) {
          lpjicbgaldo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          lpjicbgaldoBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ANOKFBLCGGMOuterClass.internal_static_ANOKFBLCGGM_descriptor;
      }

      @java.lang.Override
      public ANOKFBLCGGMOuterClass.ANOKFBLCGGM getDefaultInstanceForType() {
        return ANOKFBLCGGMOuterClass.ANOKFBLCGGM.getDefaultInstance();
      }

      @java.lang.Override
      public ANOKFBLCGGMOuterClass.ANOKFBLCGGM build() {
        ANOKFBLCGGMOuterClass.ANOKFBLCGGM result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ANOKFBLCGGMOuterClass.ANOKFBLCGGM buildPartial() {
        ANOKFBLCGGMOuterClass.ANOKFBLCGGM result = new ANOKFBLCGGMOuterClass.ANOKFBLCGGM(this);
        int from_bitField0_ = bitField0_;
        result.moduleId_ = moduleId_;
        result.sceneId_ = sceneId_;
        result.hoogfkfbckk_ = hoogfkfbckk_;
        if (lpjicbgaldoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            lpjicbgaldo_ = java.util.Collections.unmodifiableList(lpjicbgaldo_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.lpjicbgaldo_ = lpjicbgaldo_;
        } else {
          result.lpjicbgaldo_ = lpjicbgaldoBuilder_.build();
        }
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
        if (other instanceof ANOKFBLCGGMOuterClass.ANOKFBLCGGM) {
          return mergeFrom((ANOKFBLCGGMOuterClass.ANOKFBLCGGM)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ANOKFBLCGGMOuterClass.ANOKFBLCGGM other) {
        if (other == ANOKFBLCGGMOuterClass.ANOKFBLCGGM.getDefaultInstance()) return this;
        if (other.getModuleId() != 0) {
          setModuleId(other.getModuleId());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getHoogfkfbckk() != false) {
          setHoogfkfbckk(other.getHoogfkfbckk());
        }
        if (lpjicbgaldoBuilder_ == null) {
          if (!other.lpjicbgaldo_.isEmpty()) {
            if (lpjicbgaldo_.isEmpty()) {
              lpjicbgaldo_ = other.lpjicbgaldo_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLpjicbgaldoIsMutable();
              lpjicbgaldo_.addAll(other.lpjicbgaldo_);
            }
            onChanged();
          }
        } else {
          if (!other.lpjicbgaldo_.isEmpty()) {
            if (lpjicbgaldoBuilder_.isEmpty()) {
              lpjicbgaldoBuilder_.dispose();
              lpjicbgaldoBuilder_ = null;
              lpjicbgaldo_ = other.lpjicbgaldo_;
              bitField0_ = (bitField0_ & ~0x00000001);
              lpjicbgaldoBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLpjicbgaldoFieldBuilder() : null;
            } else {
              lpjicbgaldoBuilder_.addAllMessages(other.lpjicbgaldo_);
            }
          }
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
        ANOKFBLCGGMOuterClass.ANOKFBLCGGM parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ANOKFBLCGGMOuterClass.ANOKFBLCGGM) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int moduleId_ ;
      /**
       * <code>uint32 moduleId = 1;</code>
       * @return The moduleId.
       */
      @java.lang.Override
      public int getModuleId() {
        return moduleId_;
      }
      /**
       * <code>uint32 moduleId = 1;</code>
       * @param value The moduleId to set.
       * @return This builder for chaining.
       */
      public Builder setModuleId(int value) {
        
        moduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 moduleId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearModuleId() {
        
        moduleId_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 sceneId = 2;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 sceneId = 2;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sceneId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean hoogfkfbckk_ ;
      /**
       * <code>bool hoogfkfbckk = 3;</code>
       * @return The hoogfkfbckk.
       */
      @java.lang.Override
      public boolean getHoogfkfbckk() {
        return hoogfkfbckk_;
      }
      /**
       * <code>bool hoogfkfbckk = 3;</code>
       * @param value The hoogfkfbckk to set.
       * @return This builder for chaining.
       */
      public Builder setHoogfkfbckk(boolean value) {
        
        hoogfkfbckk_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool hoogfkfbckk = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHoogfkfbckk() {
        
        hoogfkfbckk_ = false;
        onChanged();
        return this;
      }

      private java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF> lpjicbgaldo_ =
        java.util.Collections.emptyList();
      private void ensureLpjicbgaldoIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          lpjicbgaldo_ = new java.util.ArrayList<PDOPJIGDNPFOuterClass.PDOPJIGDNPF>(lpjicbgaldo_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          PDOPJIGDNPFOuterClass.PDOPJIGDNPF, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder, PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder> lpjicbgaldoBuilder_;

      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF> getLpjicbgaldoList() {
        if (lpjicbgaldoBuilder_ == null) {
          return java.util.Collections.unmodifiableList(lpjicbgaldo_);
        } else {
          return lpjicbgaldoBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public int getLpjicbgaldoCount() {
        if (lpjicbgaldoBuilder_ == null) {
          return lpjicbgaldo_.size();
        } else {
          return lpjicbgaldoBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public PDOPJIGDNPFOuterClass.PDOPJIGDNPF getLpjicbgaldo(int index) {
        if (lpjicbgaldoBuilder_ == null) {
          return lpjicbgaldo_.get(index);
        } else {
          return lpjicbgaldoBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder setLpjicbgaldo(
          int index, PDOPJIGDNPFOuterClass.PDOPJIGDNPF value) {
        if (lpjicbgaldoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.set(index, value);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder setLpjicbgaldo(
          int index, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder builderForValue) {
        if (lpjicbgaldoBuilder_ == null) {
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.set(index, builderForValue.build());
          onChanged();
        } else {
          lpjicbgaldoBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder addLpjicbgaldo(PDOPJIGDNPFOuterClass.PDOPJIGDNPF value) {
        if (lpjicbgaldoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.add(value);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder addLpjicbgaldo(
          int index, PDOPJIGDNPFOuterClass.PDOPJIGDNPF value) {
        if (lpjicbgaldoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.add(index, value);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder addLpjicbgaldo(
          PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder builderForValue) {
        if (lpjicbgaldoBuilder_ == null) {
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.add(builderForValue.build());
          onChanged();
        } else {
          lpjicbgaldoBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder addLpjicbgaldo(
          int index, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder builderForValue) {
        if (lpjicbgaldoBuilder_ == null) {
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.add(index, builderForValue.build());
          onChanged();
        } else {
          lpjicbgaldoBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder addAllLpjicbgaldo(
          java.lang.Iterable<? extends PDOPJIGDNPFOuterClass.PDOPJIGDNPF> values) {
        if (lpjicbgaldoBuilder_ == null) {
          ensureLpjicbgaldoIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, lpjicbgaldo_);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder clearLpjicbgaldo() {
        if (lpjicbgaldoBuilder_ == null) {
          lpjicbgaldo_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public Builder removeLpjicbgaldo(int index) {
        if (lpjicbgaldoBuilder_ == null) {
          ensureLpjicbgaldoIsMutable();
          lpjicbgaldo_.remove(index);
          onChanged();
        } else {
          lpjicbgaldoBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder getLpjicbgaldoBuilder(
          int index) {
        return getLpjicbgaldoFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder getLpjicbgaldoOrBuilder(
          int index) {
        if (lpjicbgaldoBuilder_ == null) {
          return lpjicbgaldo_.get(index);  } else {
          return lpjicbgaldoBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public java.util.List<? extends PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder> 
           getLpjicbgaldoOrBuilderList() {
        if (lpjicbgaldoBuilder_ != null) {
          return lpjicbgaldoBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(lpjicbgaldo_);
        }
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder addLpjicbgaldoBuilder() {
        return getLpjicbgaldoFieldBuilder().addBuilder(
            PDOPJIGDNPFOuterClass.PDOPJIGDNPF.getDefaultInstance());
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder addLpjicbgaldoBuilder(
          int index) {
        return getLpjicbgaldoFieldBuilder().addBuilder(
            index, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.getDefaultInstance());
      }
      /**
       * <code>repeated .PDOPJIGDNPF lpjicbgaldo = 4;</code>
       */
      public java.util.List<PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder> 
           getLpjicbgaldoBuilderList() {
        return getLpjicbgaldoFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          PDOPJIGDNPFOuterClass.PDOPJIGDNPF, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder, PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder> 
          getLpjicbgaldoFieldBuilder() {
        if (lpjicbgaldoBuilder_ == null) {
          lpjicbgaldoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              PDOPJIGDNPFOuterClass.PDOPJIGDNPF, PDOPJIGDNPFOuterClass.PDOPJIGDNPF.Builder, PDOPJIGDNPFOuterClass.PDOPJIGDNPFOrBuilder>(
                  lpjicbgaldo_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          lpjicbgaldo_ = null;
        }
        return lpjicbgaldoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ANOKFBLCGGM)
    }

    // @@protoc_insertion_point(class_scope:ANOKFBLCGGM)
    private static final ANOKFBLCGGMOuterClass.ANOKFBLCGGM DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ANOKFBLCGGMOuterClass.ANOKFBLCGGM();
    }

    public static ANOKFBLCGGMOuterClass.ANOKFBLCGGM getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ANOKFBLCGGM>
        PARSER = new com.google.protobuf.AbstractParser<ANOKFBLCGGM>() {
      @java.lang.Override
      public ANOKFBLCGGM parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ANOKFBLCGGM(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ANOKFBLCGGM> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ANOKFBLCGGM> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ANOKFBLCGGMOuterClass.ANOKFBLCGGM getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ANOKFBLCGGM_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ANOKFBLCGGM_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ANOKFBLCGGM.proto\032\021PDOPJIGDNPF.proto\"h" +
      "\n\013ANOKFBLCGGM\022\020\n\010moduleId\030\001 \001(\r\022\017\n\007scene" +
      "Id\030\002 \001(\r\022\023\n\013hoogfkfbckk\030\003 \001(\010\022!\n\013lpjicbg" +
      "aldo\030\004 \003(\0132\014.PDOPJIGDNPFb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          PDOPJIGDNPFOuterClass.getDescriptor(),
        });
    internal_static_ANOKFBLCGGM_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ANOKFBLCGGM_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ANOKFBLCGGM_descriptor,
        new java.lang.String[] { "ModuleId", "SceneId", "Hoogfkfbckk", "Lpjicbgaldo", });
    PDOPJIGDNPFOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
