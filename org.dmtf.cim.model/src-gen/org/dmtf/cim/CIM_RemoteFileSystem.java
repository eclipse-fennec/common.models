/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Remote File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from FileSystem that represents access of the FileSystem via a network-related service. In this case, the file store is hosted by a computer, acting as a file server. For example, the file store for an NFS FileSystem is typically NOT on a ComputerSystem's locally controlled media, nor is it directly accessed through a device driver. Subclasses of RemoteFileSystem contain client-side configuration information related to the access of the FileSystem. 
 * This has been deprecated by CIM_FileShare, which works with the hosted service model. The HostedShare association will specify how the remote entity is imported and the ImportedFileShareSetting class provides the resources needed for the share to function.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RemoteFileSystem()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_FileShare\"]' Version='2.54.1' UMLPackagePath='CIM::System::FileElements' keys='CSCreationClassName,CSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RemoteFileSystem extends CIM_FileSystem {
} // CIM_RemoteFileSystem
