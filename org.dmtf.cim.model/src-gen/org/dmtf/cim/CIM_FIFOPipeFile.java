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
 * A representation of the model object '<em><b>CIM FIFO Pipe File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FIFOPipeFile is a special type of LogicalFile that represents an interprocess FIFO (sometimes referred to as a "named pipe"). Operating systems use this convention to manage interprocess communication through processes reading and writing the FIFO. The FIFO can be accessed by unrelated processes, in contrast to the more well-known command line redirection mechanism (e.g. UNIX's 'ps -eaf | grep foo', also known as an "unnamed pipe"). An exemplary operating system implementation (using the FIFO concept) is the UNIX S_IFIFO file type.
 * <!-- end-model-doc -->
 *
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FIFOPipeFile()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.6.0' UMLPackagePath='CIM::System::FileElements' keys='CSCreationClassName,CSName,FSCreationClassName,FSName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FIFOPipeFile extends CIM_LogicalFile {
} // CIM_FIFOPipeFile
