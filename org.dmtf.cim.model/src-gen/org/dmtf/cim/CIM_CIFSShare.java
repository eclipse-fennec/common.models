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
 * A representation of the model object '<em><b>CIM CIFS Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A CIFSShare represents a File, Directory, or Print Queue that is made accessible to other systems. If a File or Directory, it is associated via CIM_SharedElement. And on the client-side, the CIFSShare representing the File or Directory is associated with its mount point via CIM_ImportedShare. Other subclasses of LogicalIdentity would make the associations for other types of CIFSShare.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CIFSShare()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileElements' override.Name='string' override.Name.Description='The Name property, inherited from Share, defines the shared name by which the shared object is exported. For CIFS, this will typically be a single-level, user-friendly, system-unique name.' override.Name.MaxLen='1024' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CIFSShare extends CIM_FileShare {
} // CIM_CIFSShare
