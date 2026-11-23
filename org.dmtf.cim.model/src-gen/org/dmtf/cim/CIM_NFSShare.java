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
 * A representation of the model object '<em><b>CIM NFS Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An NFSShare represents a Directory associated via CIM_SharedElement that is made accessible to other systems. On the client-side, the NFSShare is associated with its mount point via CIM_ImportedShare.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_NFSShare()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::FileElements' override.Name='string' override.Name.Description='The Name property, inherited from Share, defines the shared name by which the shared object is exported. For NFS, this will typically be the pathname of the exported directory, using forward slashes \'/\' to precede directory names in the path.' override.Name.MaxLen='1024' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_NFSShare extends CIM_FileShare {
} // CIM_NFSShare
