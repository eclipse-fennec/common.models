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
 * A representation of the model object '<em><b>CIM Disk Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A DiskGroup is a named collection of DiskDrives and the StorageExtents accessed using those Drives. The collection is used to limit the BasedOn relationships of the Extents in the DiskGroup. Extents in the Group cannot be BasedOn storage accessed from Drives outside of the Group. For example, a SoftwareVolume created within the DiskGroup is restricted to be completely accessed using Drives in the Group. Actions such as replicate or migrate on an Extent must operate within the scope of the Extents that are present in the DiskGroup.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiskGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::DiskGroup' override.CollectionID='string' override.CollectionID.Key='true' keys='CollectionID'"
 * @generated
 */
@ProviderType
public interface CIM_DiskGroup extends CIM_CollectionOfMSEs {
} // CIM_DiskGroup
