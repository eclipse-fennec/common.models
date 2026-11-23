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
 * A representation of the model object '<em><b>CIM Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a FileSystem and a Directory which indicates that the Directory is being attached to the FileSystem. The semantics of this relationship require that the mounted Directory be contained by a FileSystem (via the FileStorage association) that is different from the FileSystem referenced as the Dependent. The Directory's containing FileSystem could be either local or remote. For example, a LocalFileSystem on a Solaris ComputerSystem can mount a Directory from the FileSystem accessed via the machine's CDROM drive, i.e., another LocalFile System. On the other hand, in a 'remote' case, the Directory is first exported by its FileSystem, which is hosted on another ComputerSystem acting (for example) as a file server. In order to distinguish these two types of Mount, it is recommended that a CIM_Export association always be defined for the remotely accessed/mounted Directories.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_Mount()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::System::FileElements' override.Antecedent='CIM_Directory REF' override.Antecedent.Max='1' override.Antecedent.Description='The Directory mounted.' override.Dependent='CIM_FileSystem REF' override.Dependent.Description='The FileSystem the Directory is mounted on.' keys='Antecedent,Dependent'"
 * @generated
 */
@ProviderType
public interface CIM_Mount extends CIM_Dependency {
} // CIM_Mount
